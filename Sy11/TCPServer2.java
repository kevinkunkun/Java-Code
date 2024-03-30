package Sy11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer2 {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        FileInputStream fis=null;
        OutputStream outputStream=null;
        try {
            serverSocket=new ServerSocket(8848);
            System.out.println("服务器启动成功");
            socket=serverSocket.accept();
            outputStream=socket.getOutputStream();
            fis=new FileInputStream("D:\\Java作业文件\\风景图.jpg");
            byte[] b=new byte[1024];
            int len;
            while ((len=fis.read(b))!=-1){
                outputStream.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(outputStream!=null) {
                    outputStream.close();
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
