class a1 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("number:"+i);
        }
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class b1 extends Thread{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println("number:"+i);

        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}



public class t6 {
    public static void main(String args[]){
        a1 A=new a1();
        b1 B=new b1();
        A.start();
        B.start();
    }
}
