package Sy10;

public class MultithreadTicketing {
    public static void main(String[] args) {
        SellTickets st=new SellTickets();
        Thread window1=new Thread(st,"售票窗口1");
        Thread window2=new Thread(st,"售票窗口2");
        Thread window3=new Thread(st,"售票窗口3");
        window1.start();
        window2.start();
        window3.start();
    }
}

class SellTickets implements Runnable{
    private  int tickets=10;
    private int n=0;
    Object obj=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(n<tickets){
                    System.out.printf("%s正在售卖第%d张票。\n",Thread.currentThread().getName(),n+1);
                    n++;
                }else {
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
