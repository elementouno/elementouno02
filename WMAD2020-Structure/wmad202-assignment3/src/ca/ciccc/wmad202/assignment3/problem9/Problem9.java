package ca.ciccc.wmad202.assignment3.problem9;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem9 {
    public static void Test() {
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(7);
        numberList.add(11);
        numberList.add(12);

        int indexNum = 4;
        System.out.println("Index:" + primeVisibility(numberList, indexNum));
    }

    public static boolean PrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

    static public int primeVisibility(ArrayList<Integer> list, int index) {
        int sum = 0;
        for (int i = 0; i < list.toArray().length; i++) {
            if(PrimeNumber(list.get(i))) {
                index -= sum;
                sum++;
            }
        }
        return sum;
    }
}