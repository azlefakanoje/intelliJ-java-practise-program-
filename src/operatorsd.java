public class operatorsd {
    public static void main(String args[]){
        int num=11;
        int num2=07;
        //1.Arithematic operator
       System.out.println("add:"+(num+num2));
        System.out.println("sub:"+(num-num2));
        System.out.println("multiply:"+(num*num2));
        System.out.println("div:"+(num/num2));
        System.out.println("modulo:"+(num%num2));

        //2. assignment operator
        int num1=55;
        System.out.println(num1+=num2);
        System.out.println(num1-=num);

//3. increment decremnet operator (++)(--)
        //4.conditional operator int variable=(condition?a:b)
        int a=10,b=20;

        int max=(a>b)?a:b;
        System.out.println(max);

        //5.comparision operator(<,>,==,<=,>=,!=)

//6.logical operators && ||
    }
}
