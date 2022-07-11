package ca.ciccc.assignment4.question1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question1 {

    public void invoke(){
        askNumber();
    }
    public void askNumber() {
        Scanner in = new Scanner(System.in);
        Set<Integer> numberList = new HashSet<>();
        int num = 1;
        int total= 0;
        do {
            System.out.println("DIGIT THE NUMBER:");
            num = in.nextInt();
            if(num == 0) {
                for (Integer i: numberList){
                    total += i;
                }
                System.out.println("sum of entered number : " + total);
                break;
            }else {
                numberList.add(num);
                System.out.println(num + " ADDED");
                System.out.println("0 - TO STOP");
            }
        } while(num != 0);
    }
}
