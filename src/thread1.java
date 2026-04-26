class MyThread extends Thread{
    public void run(){
       System.out.println("this is a thread");
    }
}




public class thread1 {
    public static void main(String args[]){
        MyThread t=new MyThread();
        t.start();
    }

}
