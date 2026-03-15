//thread A displays even number 1-50 ,thread B displays odd number 1-50.after 3 iterations thread a should sleep for 500ms.
class ThreadA extends Thread{
    public void run(){
        int count=0;
        for(int i=2;i<=50;i=i+2)
            System.out.println("Even Thread:"+i);
        count++;
        if(count % 3==0){
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class ThreadB extends Thread{
    public void run(){
        for(int i=1;i<=50;i=i+2){
            System.out.println("odd Threads:"+i);
        }
    }
}
public class question{
    public static void main(String []args){
        new ThreadA().start();
        new ThreadB().start();
    }
}