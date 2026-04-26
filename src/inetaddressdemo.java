import java.net.*;
class inetaddressdemo{
    public static void main(String args[]){
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("ip address:"+localhost);
            System.out.println("Host name:"+localhost.getHostName());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}