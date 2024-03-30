package Sy9;

import java.io.*;

public class TransmissionEfficiency {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        copyWithBuffer("C:\\video\\video.mp4","D:\\video.mp4\\copy.mp4");
        long end=System.currentTimeMillis();
        System.out.println("缓冲字节流拷贝时间："+(end-start)+"ms");
        start=System.currentTimeMillis();
        copyWithBuffer("C:\\video\\video.mp4","D:\\video.mp4\\copy.mp4");
        end=System.currentTimeMillis();
        System.out.println("文件字节流拷贝时间："+(end-start)+"ms");
    }
    private static void copyWithBuffer(String source,String destination)  {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            fis=new FileInputStream(source);
            fos=new FileOutputStream(destination);
            bis=new BufferedInputStream(fis);
            bos=new BufferedOutputStream(fos);
            int data=-1;
            while ((data=bis.read())!=-1){
                bos.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    private static void copyWithoutBuffer(String source,String destination){
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream(source);
            fos=new FileOutputStream(destination);
            int data=-1;
            while ((data=fis.read())!=-1){
                fos.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
