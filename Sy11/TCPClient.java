package Sy11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        Socket socket= null;
        OutputStream outputStream=null;
        InputStream inputStream=null;
        try {
            socket = new Socket("127.0.0.1", 9999);
            outputStream =socket.getOutputStream();
            outputStream.write("你好，服务器".getBytes());
            inputStream=socket.getInputStream();
            byte[] b=new byte[1024];
            int len=inputStream.read(b);
            System.out.println(new String(b,0,len));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
                try {
                    if(socket!=null) {
                        socket.close();
                    }

                    if(outputStream!=null) {
                        outputStream.close();
                    }

                    if(inputStream!=null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
