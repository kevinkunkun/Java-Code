package Sy9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClonedObject {
    public static void main(String[] args) {
        Monkey monkey=new Monkey(890,"孙悟空");
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos=new FileOutputStream("D:\\Java作业文件\\file2.txt");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(monkey);
            System.out.println("write file over...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                if(oos!=null) {
                    oos.close();
                }
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}