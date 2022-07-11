package ca.ciccc.wmad202.assignment3.problem8;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem8 {
    /**Design and implement a method which has one input parameter, called topLimit, which is
     a number between 40 and 100. Also, the method has a second input parameter which is
     also a positive integer, called number.
     -The method should create and returns list which contains all numbers in range 2 (two) to
     topLimit that are divisible to number.*/
    public static ArrayList<Integer> CreateList(int topLimit, int number) {
        ArrayList<Integer> arrayL = new ArrayList<Integer>();
        for(int i = 2; i <= topLimit; i++) {
            if(i % number == 0) {
                arrayL.add(i);
            }
        }
        System.out.println(arrayL);
        return arrayL;
    }
    public static void Test() {
        CallFunction(45, 6);
        CallFunction(50, 10);
        CallFunction(73, 15);
    }
    //Take the input number
    public static void CallFunction(int topLimit, int number) {
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Digit one number:");
        int topLimit = in.nextInt();
        System.out.println("Digit another number:");
        int number = in.nextInt(); **/
        if(topLimit > 40 && topLimit < 100) {
            CreateList(topLimit, number);
        } else {
            System.out.println("Need to be a number between 40 and 100!");
        }
    }

}
