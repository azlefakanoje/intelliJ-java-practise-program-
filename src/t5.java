class A extends Thread{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("number:"+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=50;i>=0;i--){
            System.out.println("number:"+i);
        }

    }
}




public class t5 {
    public static void main(String args[]){
        A t1=new A();
        B t2=new B();
        t1.start();
        t2.start();
    }
}
