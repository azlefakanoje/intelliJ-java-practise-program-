import java.net.*;
import java.io.*;
class serverdemo{
    public static void main(String args[]){
        try{//tcp/ip
            ServerSocket ss=new ServerSocket(1234);
            System.out.println("server is waiting");
            Socket s=ss.accept();
            System.out.println("client is connected");
            DataInputStream input=new DataInputStream(s.getInputStream());
            String message=input.readUTF();
            System.out.println("message:"+message);
            ss.close();
            s.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}