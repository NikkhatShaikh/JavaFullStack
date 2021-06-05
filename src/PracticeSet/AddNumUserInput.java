package PracticeSet;

import java.util.Scanner; // import the Scanner class

public class AddNumUserInput {
    public static void main(String[] args) {
        int x,y,Sum;
        Scanner obj= new Scanner(System.in);  //create obj of scanner class

        System.out.println("Enter First Number");
        x=obj.nextInt();    //  read user input

        System.out.println(" Enter Second Number");
        y=obj.nextInt();    // read second user input

        Sum=x+y;

        System.out.println("Addition of Two Given Number " +Sum);
    }

}
