package guessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int num;
        int guess;
        int trials=0;

        Scanner obj =  new Scanner(System.in);
        num=(int)(Math.random()*100)+1;

        do{
            System.out.println("enter the guess Number");

            guess = obj.nextInt();

            trials++;

            if(num>guess){
                System.out.println("number is greater");
            }else if(num<guess){
                System.out.println("number is smaller");
            }else {
                System.out.println("Congratulation !! You Guess Correct Number"+ " your trials is "+trials);
            }
        }
        while(num!=guess);

    }
}
