import java.net.*;
import java.io.*;
public class urldemo {
    public static void main(String args[]){
        try {
            URL url = new URL("https://services.msbte.edu.in/scheme_digi/pdfdownload/download/");
            System.out.println("protocol:"+url.getProtocol());
            System.out.println("host:"+url.getHost());
            System.out.println("File:"+url.getFile());
            System.out.println("port:"+url.getPort());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
