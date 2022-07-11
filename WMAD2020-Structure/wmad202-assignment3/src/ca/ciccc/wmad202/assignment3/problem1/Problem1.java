package ca.ciccc.wmad202.assignment3.problem1;

import java.util.Scanner;

public class Problem1 {
    /**Design and implement a function which receives a positive integer as its input parameter
     and checks whether the number is a prime number or not. If it is a prime number, the
     method returns true and if not the method will return false. */
    public static boolean PrimeNumber(int num) {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    //Take the input number
    /*
    public static void TakeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digit one number:");
        int n = in.nextInt();
        if(PrimeNumber(n)) {
            System.out.println("THE NUMBER IS PRIME!");
        } else {
            System.out.println("THE NUMBER ISNT PRIME!");
        }
    }*/
    public static void Test() {
        callFunction(5);
        callFunction(7);
        callFunction(8);
        callFunction(9);
        callFunction(121);
    }
    public static void callFunction(int n) {
        if(PrimeNumber(n)) {
            System.out.println("THE NUMBER IS PRIME!");
        } else {
            System.out.println("THE NUMBER ISNT PRIME!");
        }
    }
}
