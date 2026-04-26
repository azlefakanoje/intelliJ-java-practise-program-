import java.util.Scanner;
class NoMatchException extends Exception{
    NoMatchException (String msg){
        super(msg);
    }
}



public class exe4 {
    public static void main(String args[]){
        System.out.println("enter string");

        Scanner scr=new Scanner(System.in);
        String str=scr.nextLine();
        System.out.println("string:"+str);
        try{
            if(!str.equals("India")){
                throw new NoMatchException("the string is not eqals to Msbte its :"+str);

            }else{
                System.out.println("the string is MSBTE");

            }
        }catch(NoMatchException e){
            System.out.println(e.getMessage());

        }


    }
}
