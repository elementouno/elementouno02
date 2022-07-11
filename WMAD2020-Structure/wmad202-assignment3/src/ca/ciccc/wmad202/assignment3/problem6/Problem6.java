package ca.ciccc.wmad202.assignment3.problem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Problem6 {
    /**Write a method which receives a list of integers which may contains repeated numbers.
     The method removes the repeated numbers and keeps the distinct numbers. The function
     should return the list of distinct numbers.  */
    public static void Test(){
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(1);
        numberList.add(2);
        numberList.add(2);
        numberList.add(4);

        ArrayList<Integer> hashed = new ArrayList<>(new HashSet<>(numberList));

        System.out.println(hashed);
    }
}
