public class switchd {
    // switch is a conditional statment we use it to check the multiple cases against the a value of variable.it uses the keyword switch and it use break to shift the control out of the program when the value of variable is matched

    // syntax  sw
    public static void main(String args[]){
        int day=2;
        switch(day){
            case 1:
                System.out.println("monday");
                break;
             case 2:
                 System.out.println("tuesday");
                 break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            default:
                System.out.println("invalid choice");





        }
    }
}
