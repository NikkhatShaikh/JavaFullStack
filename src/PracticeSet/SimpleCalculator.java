package PracticeSet;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1  , num2;                   // use double because user can take integer/ floating value

        Scanner obj= new Scanner(System.in);
        System.out.println("Enter First number");

        num1 = obj.nextDouble();

        System.out.println("Enter Second Number");
        num2 = obj.nextDouble();

        System.out.println(" Enter an Operator (+,-,*,/,%");
        char operator = Scanner.next().charAt(0);
        Scanner.close();
        double output;

        switch(operator)https://github.com/NikkhatShaikh/JavaFullStack.githttps://github.com/NikkhatShaikh/JavaFullStack.git
        {
            case '+':
                output=num1+num2;
                break;
            case '-':
                output=num1-num2;
                break;
            case '*':
                output=num1*num2;
                break;
            case'/':
                output=num1/num2;
                break;
            case'%':
                output=num1%num2;
                break;
            default:
                System.out.println("You have Entered Wrong Operator");
                return;

        }

        System.out.println(num1+" "+operator+" "+num2+":"+output);


    }
}
