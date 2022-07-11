package ca.ciccc.wmad202.assignment3.problem5;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem5 {
    /**Write a method, which receives a list of positive integers between 1 and 99, which may
     or may not contains repeated numbers.
     -The methods should print out how many each item in the list is repeated. */
    public static void RepeatedTimes(int x[]) {
        int [] countersArray = new int[99];

        boolean resp = true;
        for(int i = 0; i < x.length; i++) {
            if(x[i] < 1 || x[i] > 100) {
                System.out.println("Need to be greater or equal 1 and smaller than 100!!");
                resp = false;
            }
        }
        if(resp) {
            for(int i = 0; i < countersArray.length; i++) {
                countersArray[i] = 0;
            }
            for (int number: x) {
                countersArray[number-1]++;
            }
            for(int index=0; index <countersArray.length; index++) {
                if(countersArray[index] > 0) {
                    System.out.println("Item: " + (index+1) + "has been repeated for" + countersArray[index]);
                }
            }
        }
    }

    public static void Test() {
        int n[] = {1, 2, 3, 4, 5, 6, 7};
        RepeatedTimes(n);
        int n2[] = {3, 3, 3, 5, 5, 6, 7};
        RepeatedTimes(n2);
        int n3[] = {4, 4, 6, 7, 8, 9, 10};
        RepeatedTimes(n3);
    }
    //Take the input numbers
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
        RepeatedTimes(n);
    } */
}
