package ca.ciccc.wmad202.assignment3.problem3;

import java.util.Scanner;

public class Problem3 {
    /**Design and implement a method which receives a positive integer as its first input
     parameter and a format (which is either SHAPE1 or SHAPE2 or SHAPE3) as the second
     input parameter and prints the following patterns. */
    public static void doingShape(int number1, String s) {
        if(s.equals("SHAPE 2") || s.equals("SHAPE2") || s.equals("shape 2") ||s.equals("shape2")) {
            while(number1 >= 0) {
                for(int i = 1; i <= number1; i++) {
                    System.out.print("*");
                }
                number1 = number1 - 1;
                System.out.printf("\n");
            }
        }
        else if(s.equals("SHAPE 3") || s.equals("SHAPE3") || s.equals("shape 3") ||s.equals("shape3")) {
            int n = 1;
            while(n <= number1) {
                for(int i = 1; i <= n; i++) {
                    System.out.print("*");
                }
                n = n + 1;
                System.out.printf("\n");
            }
        }
        else if(s.equals("SHAPE 1") || s.equals("SHAPE1") || s.equals("shape 1") ||s.equals("shape1")) {
            for (int i = 0; i<number1; i++ ) {
                for (int j = 0; j < i; j++){
                    System.out.print(' ');
                }
                for(int f = 0; f < (number1-i)*2-5; f++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        }

        public static void Test() {
            doingShape(5, "SHAPE1");
            doingShape(6, "SHAPE2");
            doingShape(7, "SHAPE3");
        }

        /*
    public static void TakeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digit one number:");
        int n = in.nextInt();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the SHAPE:");
        String format = myObj.nextLine();
        doingShape(n, format);
    } */
}
