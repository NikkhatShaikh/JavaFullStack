package controlStatement;

import java.util.Scanner;

public class DoWhileDemo {
    public  static void main(String args[]){
        int i ;
        int sum =0;
        char Choice ;
        Scanner scanner = new Scanner(System.in);   // scanner is obj here

        do{
             System.out.println(" Enter the number");
             i=scanner.nextInt();
             sum= sum+i;
            System.out.println("Want to continue Type Y for exit type N");

            Choice=scanner.next().charAt(0);
        }
        while(Choice=='Y'|| Choice=='y');
        System.out.println("Sum is ==>"+sum);

    }

}
