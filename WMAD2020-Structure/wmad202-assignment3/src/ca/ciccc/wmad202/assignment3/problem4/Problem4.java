package ca.ciccc.wmad202.assignment3.problem4;

import java.util.Scanner;

public class Problem4 {
    /**Implement a function which receives a list of positive integers as input parameter. The
     numbers in the list are only between 1 and 99. The list might have repeated numbers. The
     method will return the number that is repeated the most. If there are multiple numbers
     that are repeated the most, returns only one of them*/
    public static int Repeated(int numbers[]) {
        int number = 0;
        boolean resp = true;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 1 || numbers[i] > 100) {
                System.out.println("Need to be greater or equal 1 and smaller than 100!!");
                resp = false;
            }
        }
        if(resp) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        // got the duplicate element
                        number = numbers[i];
                        break;
                    }
                }
            }
        }
        return number;
    }

    public static void Test() {
        int n[] = {1, 2, 3, 4, 5, 6, 7};
        callFunction(n);
        int n2[] = {3, 3, 3, 5, 5, 6, 7};
        callFunction(n2);
        int n3[] = {4, 4, 6, 7, 8, 9, 10};
        callFunction(n3);
    }
    public static void callFunction(int[] n) {
        if(Repeated(n) == 0) {
            System.out.println("DONT HAVE ANY REPEATED NUMBER!");
        } else {
            System.out.println("REPEATED NUMBER: " + Repeated(n));
        }
    }
    //Take the input number
    /*
    public static void TakeNumbers() {
        Scanner in = new Scanner(System.in);
        int n[] = new int[5];
        for(int i = 0; i < n.length; i++) {
            System.out.println("Digit one number:");
            n[i] = in.nextInt();
            if(n[i] < 1 || n[i] > 100) {
                System.out.println("Need to be greater or equal 1 and smaller than 100");
                System.out.println("Digit again:");
                n[i] = in.nextInt();
            }
        }
    } */
}
