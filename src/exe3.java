import java.util.Scanner;


class AuthenticationFailureexception extends Exception{
    AuthenticationFailureexception (String msg){
        super (msg);
    }
}


public class exe3 {
    public static void main(String args[]){
        System.out.println("eneter passowrd:");
        Scanner scr=new Scanner(System.in);
        String pas=scr.nextLine();
        String p="azlman";
        System.out.println("password:"+pas);
        try{
            if(!pas.equals(p)){
                throw new AuthenticationFailureexception("passowrd is incorrect");

            }else{
                System.out.println("pasword is correct");

            }
        }catch(AuthenticationFailureexception e){
            System.out.println(e.getMessage());

        }




    }
}
