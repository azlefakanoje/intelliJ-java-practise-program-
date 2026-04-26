class Myrun implements Runnable{
    public void run(){
        System.out.println("this is runnable thread");
    }
}

public class thread2{
    public static void main(String args[]){
        Myrun m=new Myrun();
        Thread t=new Thread(m);
        t.start();
    }
}