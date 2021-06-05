package PracticeSet;
import java.util.Scanner;

public class SubUserInput {
    public static void main(String[] args) {
        int x,y,Sub;

        Scanner obj = new Scanner(System.in);

        System.out.println(" Enter First numbers");
        x =obj.nextInt();     // take input from user

        System.out.println(" Enter Second Number");
        y = obj.nextInt();    // take second input from user

        Sub = x-y;

        System.out.println("Substraction of two numbers "+ Sub);
    }
}
