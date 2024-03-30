package Sy9;
import java.io.*;

public class ByteStreamToCharacterStream {
    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        OutputStreamWriter osw=new OutputStreamWriter(System.out);
        BufferedWriter bw=new BufferedWriter(osw);
        try {
            System.out.println("May I have your name?");
            String input=br.readLine();
            bw.write("Hllow,"+input);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
