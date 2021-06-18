package exceptionHandling;

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        int i=10;
        int j;
        Scanner scanner = new Scanner(System.in); // scanner is a stream

        i=scanner.nextInt();
        System.out.println(" enter num1");

        j=scanner.nextInt();

        System.out.println(" Enter num2");

        try{
            int k = i/j;
            System.out.println("Hii");
            System.out.println("HII");
        }  catch (Exception e){
            System.out.println(e);
        }finally {
            scanner.close();
        }
    }
}
