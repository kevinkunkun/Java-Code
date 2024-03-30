package Sy10;

import java.util.Random;

public class Demo02 {
    static int count = 0;
    static Object bun = new Object();
    static Object work = new Object();

    public static void main(String[] args) {
        Thread cons1 = new Thread(new Consumer(), "顾客1");
        Thread cons2 = new Thread(new Consumer(), "顾客2");
        Thread product = new Thread(new Product());
        cons1.start();
        cons2.start();
        product.start();
    }
}

class Consumer implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized ((Demo02.bun)) {
                int m = new Random().nextInt(10) + 1;
                String name = Thread.currentThread().getName();
                System.out.printf("%s告知老板要%d个包子......\n", name, m);
                if (Demo02.count < m) {
                    try {
                        System.out.println("包子不够卖，等待老板......");
                        Demo02.bun.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (Demo02.count > m) {
                    Demo02.count = Demo02.count - m;
                    System.out.printf("%s买走了%d个包子，剩余%d个包子。\n", name, m, Demo02.count);
                }
                if (Demo02.count < 5) {
                    synchronized (Demo02.work) {
                        Demo02.work.notify();
                        System.out.println("包子剩余不多了，唤醒老板继续干活！");
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Product implements Runnable{

    @Override
    public void run() {
        while (true){
            synchronized (Demo02.bun){
                int m=new Random().nextInt(20)+1;
                Demo02.count+=m;
                System.out.printf("--------老板做了%d个包子，剩余%d个。\n",m,Demo02.count);
                Demo02.bun.notify();
                System.out.println("唤醒顾客，尝试售卖......");
            }
            if(Demo02.count>=20){
                synchronized (Demo02.work){
                    try {
                        System.out.println("做的太多，老板休息一下！");
                        Demo02.work.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
