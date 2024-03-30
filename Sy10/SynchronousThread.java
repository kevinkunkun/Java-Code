package Sy10;

public class SynchronousThread {
    public static void main(String[] args) {
        SellTickets1 st=new SellTickets1();
        Thread window1=new Thread(st,"售票窗口1");
        Thread window2=new Thread(st,"售票窗口2");
        Thread window3=new Thread(st,"售票窗口3");
        window1.start();
        window2.start();
        window3.start();
    }
}

class SellTickets1 implements Runnable{
    private  int tickets=10;
    private int n=0;

    @Override
    public void run() {
        while (true){
            sell();
    }
    }
    public synchronized void sell(){
        if(n<tickets){
            System.out.printf("%s正在售卖第%d张票。\n",Thread.currentThread().getName(),n+1);
            n++;
        }else {
            System.exit(0);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
