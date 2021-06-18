package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int i ;
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Value");

        i=obj.nextInt();

        System.out.println("Enter  the String value");

        str=obj.next();

        System.out.println("Your Entered Value is "+i);
        System.out.println("Your Entered  String value is "+str);
    }
}
