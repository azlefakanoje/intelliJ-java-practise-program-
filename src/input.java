import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        System.out.println("enter your name:");
        String str=src.nextLine();
        System.out.println("name:"+str);
        System.out.println("enter your age:");
        int age=src.nextInt();
        System.out.println("age:"+age);




    }
}
