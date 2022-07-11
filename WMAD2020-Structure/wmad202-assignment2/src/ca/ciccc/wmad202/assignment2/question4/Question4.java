package ca.ciccc.wmad202.assignment2.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question4 {

    public void stopInvalid(){

        List<Integer> numbers = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter only number no invalid please : ");
            try {
                int check = scanner.nextInt();
                numbers.add(check);
            }catch (Exception e){
                int max = Collections.max(numbers);
                int min = Collections.min(numbers);
                int diff = max-min;
                System.out.println("list of entered numbers: " + numbers);
                System.out.println("Max of entered numbers : "+ max);
                System.out.println("Min of entered numbers : "+ min);
                System.out.println("Distance of entered numbers : "+ diff);
                break;
            }

        }
    }
}
