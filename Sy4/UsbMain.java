package Sy4;

import java.util.concurrent.Callable;

interface USB{
    public abstract void open();
    public abstract void close();
    }
class KeyBoard implements USB{

    @Override
    public void open() {

        System.out.println("键盘已接入");
    }

    public void knock(){
        System.out.println("键盘开始敲击");
    }

    @Override
    public void close() {

        System.out.println("键盘接口已拔出");
    }

}
class Mouse implements USB{

    @Override
    public void open() {

        System.out.println("鼠标已插入");
    }

    public void click(){
        System.out.println("鼠标开始点击");
    }

    @Override
    public void close() {

        System.out.println("鼠标已拔出");
    }
}
class Computer{
    public void run(){
        System.out.println("电脑已开机");
    }
    public static void useUSB(USB usbDevise) {
        usbDevise.open();
        if(usbDevise instanceof Mouse){
            ((Mouse)usbDevise).click();
        }else if(usbDevise instanceof KeyBoard){
            ((KeyBoard)usbDevise).knock();
        }
        usbDevise.close();
    }
    public void shutdown(){
        System.out.println("电脑已关机");
    }
}

public class UsbMain {
    public static void main(String[] args) {
        Computer cpt=new Computer();
        cpt.run();
        Computer.useUSB(new KeyBoard());
        Computer.useUSB(new Mouse());
        cpt.shutdown();
            }
        }
