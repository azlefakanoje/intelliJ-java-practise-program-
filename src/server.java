import java.net.ServerSocket;
import java.net.Socket;

class server{
    public static void main(String args[]){
        try{
            ServerSocket ss=new ServerSocket(1234);
            System.out.println("server is waiting");
            Socket s=ss.accept();
            System.out.println("client connectedd");



        }catch(Exception e ){
            System.out.println(e);
        }
    }
}