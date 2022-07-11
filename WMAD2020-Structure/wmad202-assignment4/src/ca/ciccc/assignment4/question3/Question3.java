package ca.ciccc.assignment4.question3;

import java.util.*;

public class Question3 {

    public void invoke() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number which is greater than 50 : ");
        boolean keepAsking = true;

        while (keepAsking) {
            int num = scanner.nextInt();
            if (num >= 50 ) {
                keepAsking = false;
                calculateDictionary(num);
            }else {
                System.out.println("Enter a number greater then 50 : ");
            }
        }
    }

    public void calculateDictionary(int num) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        Set<Integer> divisibleBy2 = new HashSet<>();
        Set<Integer> divisibleBy3 = new HashSet<>();
        Set<Integer> divisibleBy4 = new HashSet<>();
        Set<Integer> divisibleBy5 = new HashSet<>();
        Set<Integer> divisibleBy6 = new HashSet<>();
        Set<Integer> divisibleBy7 = new HashSet<>();
        Set<Integer> divisibleBy8 = new HashSet<>();
        Set<Integer> divisibleBy9 = new HashSet<>();

        for(int i  = 1; i <= num; i++) {
            if (i % 2 == 0) {
                divisibleBy2.add(i);
            }
            if(i % 3 == 0){
                divisibleBy3.add(i);
            }
            if(i % 4 == 0){
                divisibleBy4.add(i);
            }
            if(i % 5 == 0){
                divisibleBy5.add(i);
            }
            if(i % 6 == 0){
                divisibleBy6.add(i);
            }
            if(i % 7 == 0){
                divisibleBy7.add(i);
            }
            if(i % 8 == 0){
                divisibleBy8.add(i);
            }
            if(i % 9 == 0){
                divisibleBy9.add(i);
            }
        }
        map.put(2,divisibleBy2);
        map.put(3,divisibleBy3);
        map.put(4,divisibleBy4);
        map.put(5,divisibleBy5);
        map.put(6,divisibleBy6);
        map.put(7,divisibleBy7);
        map.put(8,divisibleBy8);
        map.put(9,divisibleBy9);
        System.out.println("2 :" + map.get(2));
        System.out.println("3 :" + map.get(3));
        System.out.println("4 :" + map.get(4));
        System.out.println("5 :" + map.get(5));
        System.out.println("6 :" + map.get(6));
        System.out.println("7 :" + map.get(7));
        System.out.println("8 :" + map.get(8));
        System.out.println("9 :" + map.get(9));

    }
}
