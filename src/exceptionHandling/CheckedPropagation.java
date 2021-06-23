package exceptionHandling;

// checked exceptions are not forwarded in calling chain - propagation

import java.io.IOException;

public class CheckedPropagation {

    void m () throws IOException {
        throw new java.io.IOException(" device error"); // create exception - for stop the flow of program
    }


    void n () throws IOException {     // by using throws we can handle the throw exception
        m();
    }

    void p(){

         try {
             n();

         }catch (Exception e){
             System.out.println(" Exception is handled");
         }
    }

    public static void main(String[] args) {
        CheckedPropagation checkedPropagation = new CheckedPropagation();
        checkedPropagation.p();
        System.out.println(" Normal Flow");
    }

}
