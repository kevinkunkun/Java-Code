package Sy11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient1 {
    public static void main(String[] args)  {
        Socket socket= null;
        OutputStream outputStream=null;
        FileInputStream fis=null;
        InputStream inputStream=null;
        try {
            socket = new Socket("127.0.0.1",8888);
            outputStream=socket.getOutputStream();
            fis=new FileInputStream("D:\\Java作业文件\\风景图.jpg");
            byte[] b=new byte[1024];
            int len;
            while ((len=fis.read(b))!=-1){
                outputStream.write(b,0,len);
            }
            socket.shutdownOutput();
            inputStream=socket.getInputStream();
            len=inputStream.read(b);
            System.out.println(new String(b,0,len));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
                try {
                    if(outputStream!=null) {
                        outputStream.close();
                    }

                    if(inputStream!=null) {
                        inputStream.close();
                    }

                    if(fis!=null) {
                        fis.close();
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
