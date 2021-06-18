package exceptionHandling;

// exception is nothing but unwanted event is occur & distrub flow of program.
// exception-for gracefully termination of program exception is used.
// it does not stop flow of program.
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            String Name = null;
            System.out.println(Name.length());
        } catch (NullPointerException e){
            System.out.println(e);
        }

        try {
            int i =10;
            int j = i/0;
        } catch (ArithmeticException e){
            System.out.println("divided by zero exception");
        }

        System.out.println("hi");

    }
}
