class AgeNegative extends Exception{
    AgeNegative(String msg) {
        super(msg);
    }
}

class exe1{
    public static void main(String args[]){
        int age=-11;
        try{
            if(age<0){
                throw new AgeNegative("age is in negative");
            }else{
                System.out.println("age is positive ");

            }
        }catch(AgeNegative e){
            System.out.println(e.getMessage());

        }

    }
}