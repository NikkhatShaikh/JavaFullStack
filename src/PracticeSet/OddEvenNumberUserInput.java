package PracticeSet;

import java.util.Scanner;

public class OddEvenNumberUserInput {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter integer Number");

        Scanner obj= new Scanner(System.in);   // create object of scanner class
        num=obj.nextInt();                 // take input from user

        if(num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }

    }
}
