class threadA extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println("even number:"+i);

                }
            if (i==6){
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
class threadB extends Thread{
    public void run(){
    for(int i=0;i<=10;i++) {
        if (i % 2 != 0) {
            System.out.println("odd number:" + i);
        }
    }

    }
}


public class t4 {
    public static void main(String args[]){
        threadA t1=new threadA();
        threadB t2=new threadB();
        t1.start();
        t2.start();


    }
}
