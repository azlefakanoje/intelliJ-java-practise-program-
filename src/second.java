 import java.util.Scanner;
public class second{
    public static void main(String args[]){
        int operation,num1,num2;
        Scanner scr=new Scanner(System.in);
        System.out.println("enter num1:");
        num1=scr.nextInt();
        System.out.println("enter num2:");
        num2=scr.nextInt();
        System.out.println("operation:1 = Add");
        System.out.println("operation:2 = substraction");
        System.out.println("operation:3 = multiplication");
        System.out.println("operation:4 = Division");
        System.out.println("enter the operation:");
        operation=scr.nextInt();
        switch(operation){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("invalid operation");
        }

    }

}