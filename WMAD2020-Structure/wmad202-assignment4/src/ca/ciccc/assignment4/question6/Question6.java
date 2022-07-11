package ca.ciccc.assignment4.question6;

import java.util.*;

public class Question6 {

    public void invoke() {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(-1,3,4,4,9);
        List<Integer> list3 = Arrays.asList(1,6,3,8,4,7);

        Set<Integer> result1 = combinesWay1(list1,list2,list3);
        List<Integer> result2 = combinesWay2(list1,list2,list3);

        System.out.println("Set solution : ");
        System.out.println(result1);
        System.out.println("List solution : ");
        System.out.println(result2);

    }

    public Set<Integer> combinesWay1(List<Integer> list1,List<Integer> list2,List<Integer> list3) {
        Set<Integer> integers = new HashSet<>();
        for (Integer i: list1){
            integers.add(i);
        }
        for (Integer i: list2){
            integers.add(i);
        }
        for (Integer i: list3){
            integers.add(i);
        }
        return integers;
    }

    public List<Integer> combinesWay2(List<Integer> list1,List<Integer> list2,List<Integer> list3) {
        List<Integer> integers = new ArrayList<>();

        for (Integer i: list1){
            if (!integers.contains(i)){
                integers.add(i);
            }
        }
        for (Integer i: list2){
            if (!integers.contains(i)){
                integers.add(i);
            }
        }
        for (Integer i: list3){
            if (!integers.contains(i)){
                integers.add(i);
            }
        }
        return integers;
    }
}
