class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
class exe{
    public static void main(String args[]){
        try{
            throw new MyException("it is user defined exception");
        }catch(MyException e){
            System.out.println(e.getMessage());

        }
    }
}