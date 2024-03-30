package Sy11;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class TCPClient2 {
    public static void main(String[] args) {
        Socket socket= null;
        InputStream inputStream=null;
        FileOutputStream fos=null;
        InputStream inputStream1=null;
        try {
            socket=new Socket("127.0.0.1",8848);
            File dir=new File("D:\\load1");
            if(!dir.exists()) {
                dir.mkdir();
            }
            String filename=" "+System.currentTimeMillis()+new Random().nextInt(99999)+".jpg";
            File file=new File(dir,filename);
            fos=new FileOutputStream(file);
            inputStream=socket.getInputStream();
            byte[] b=new byte[1024];
            int len;
            while ((len=inputStream.read(b))!=-1){
                fos.write(b,0,len);
            }
            fos.flush();
            socket.shutdownOutput();
            System.out.println("下载成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream!=null) {
                    inputStream.close();
                }

                if(fos!=null) {
                    fos.close();
                }

                if(socket!=null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
