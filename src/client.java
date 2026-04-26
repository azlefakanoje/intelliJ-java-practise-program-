import java.net.*;
import java.io.*;
class client{
    public static void main(String args[]){
        try {//tcp/ip
            Socket s = new Socket("localhost", 1234);
            DataOutputStream output = new DataOutputStream(s.getOutputStream());
            output.writeUTF("Hello World");
            System.out.println("Hello world");
            s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}