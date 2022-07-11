package ca.ciccc.assignment4.question4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {

    public void invoke() {

       int nonRepeated =  listMethod(Arrays.asList(1,1,2,2,3,4,4,5,5,6,6,7,7,8,8,9,9));
        System.out.println(nonRepeated);
    }

    public int listMethod(List<Integer> list) {
        List<Integer> checkList = new ArrayList<>();
        for (Integer n: list) {
            if (checkList.contains(n)){
                checkList.remove(n);
            }else {
                checkList.add(n);
            }
        }
        if (checkList.size() == 1) {
            return checkList.get(0);
        }else {
            return -1;
        }

    }
}
