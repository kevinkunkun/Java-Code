package Sy11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class TCPServer1{
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        FileOutputStream fos=null;
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            serverSocket=new ServerSocket(8888);
            System.out.println("服务器启动成功");
            while (true){
                socket=serverSocket.accept();
                File dir=new File("D:\\load");
                if(!dir.exists()){
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
                outputStream=socket.getOutputStream();
                outputStream.write("上传成功！".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream!=null) {
                    inputStream.close();
                }
                if(outputStream!=null) {
                    outputStream.close();
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
