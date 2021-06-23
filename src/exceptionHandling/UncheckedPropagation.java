package exceptionHandling;

public class UncheckedPropagation {

    //  by default unchecked exceptions are forwarded in calling chain - propagated

    void m(){
        int i= 100/0;  // exception is occurs where it is not handled
    }

    void n(){  //propagated to previous n() method where it is not handled
        m();
    }

    void p(){  //propagated to p() method where exception is handled.

        try{
            n();
        } catch (Exception e){
            System.out.println(" Exception is handled");
        }
    }

    public static void main(String[] args) {

        UncheckedPropagation uncheckedPropagation = new UncheckedPropagation();
        uncheckedPropagation.p();
        System.out.println(" Normal Flow");
    }


}


/** Note
 * Exception can be handled in any method in call stack
 * either in main() method,p() method,n() method or m() method.
 */