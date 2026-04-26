import java.util.Scanner;


class balException extends Exception{
    balException(String msg){
        super(msg);
    }
}



public class exe2 {
    public static void main(String args[]){
        System.out.println("enter balance:");
        Scanner src=new Scanner(System.in);
        int balance=src.nextInt();
        System.out.println("balance:"+balance);
        try{
            if(balance<1500){
               throw new balException("balance is less than 1500");

            }else{
                System.out.println("balance is more than 1500");

            }
        }catch(balException e){
            System.out.println(e.getMessage());

        }


    }
}
