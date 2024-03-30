package Sy11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        ServerSocket serverSocket= null;
        Socket socket=null;
        InputStream is=null;
        OutputStream outputStream=null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("服务器已启动，等待客户端连接......");
            socket=serverSocket.accept();
            is=socket.getInputStream();
            byte[] buffer=new byte[1024];
            int len = is.read(buffer);
            System.out.println(new String(buffer,0,len));
            outputStream=socket.getOutputStream();
            outputStream.write("你好，客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(socket!=null) {
                    socket.close();
                }

                if(is!=null) {
                    is.close();
                }

                if(outputStream!=null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
