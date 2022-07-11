package ca.ciccc.wmad202.assignment3.problem2;

import java.util.Scanner;

public class Problem2 {
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
    public static int NextPrime(int n) {
        int result = 0;
        for(int i = n + 1; i <= n * 2; i++) {
            if(PrimeNumber(i)) {
                result = i;
                break;
            } else {
                result = 0;
            }
        }
        return result;
    }
    public static void Test() {
        callFunction(5);
        callFunction(7);
        callFunction(10);
        callFunction(100);
        callFunction(121);
    }
    public static void callFunction(int n) {
        if(PrimeNumber(n)) {
            System.out.println("THE NUMBER IS PRIME!");
            System.out.println("THE NEXT PRIME NUMBER IS:" + NextPrime(n));
        } else {
            System.out.println("THE NUMBER ISNT PRIME!");
            System.out.println("THE NEXT PRIME NUMBER IS:" + NextPrime(n));
        }
    }
    //Take the input number
    /*
    public static void TakeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digit one number:");
        int n = in.nextInt();
        if(PrimeNumber(n)) {
            System.out.println("THE NUMBER IS PRIME!");
            System.out.println("THE NEXT PRIME NUMBER IS:" + NextPrime(n));
        } else {
            System.out.println("THE NUMBER ISNT PRIME!");
            System.out.println("THE NEXT PRIME NUMBER IS:" + NextPrime(n));
        }
    }*/
}
