package exceptionHandling;

// custom exception - user define exception.


public class CustomException {
    public static void main(String[] args)  throws Exception{
        int i = 0;
        if(i==0){
            throw new MyException("Number is 0");
            }else {
            System.out.println(" Number is not 0");
        }

    }
}

class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}