package ca.ciccc.wmad202.assignment2.question1;

import java.util.Scanner;

public class Question1 {

    /*
    Problem1 Read two numbers from input (like A and B) and
• First prints all numbers between A and B (A and B not included), which are divisible to
both 3 and 5.
• Then prints all numbers between A and B (A included by B not included), which are
divisible by either 6 or 7.
• Finally prints all numbers between A and B (A and B both included), which are not
divisible by 3.
     */

    public void readAndPrintNumberDivisible() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1 : ");
        int number1 = scan.nextInt();
        System.out.println("Please enter number 2 : ");
        int number2 = scan.nextInt();

        int start = 0;
        int end = 0;
        if(number1 < number2) {
            start = number1;
            end = number2;
        }else {
            start = number2;
            end = number1;
        }
        // A and B are not included
        for(int i = start + 1; i < end ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("numbers : divisible by 3 and 5 = " + i);
            }
        }
        // A included by B not included
        for(int i = start; i < end ; i++) {
            if (i % 6 == 0 || i % 7 == 0){
                System.out.println("numbers : divisible by 6 or 7 =  " + i);
            }
        }

        for(int i = start; i <= end ; i++) {
            if (i % 3 == 0 ){
                System.out.println("numbers : divisible by 3 =   " + i);
            }
        }
    }


}
