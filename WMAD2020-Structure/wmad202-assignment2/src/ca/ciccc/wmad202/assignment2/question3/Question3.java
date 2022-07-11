package ca.ciccc.wmad202.assignment2.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Question3 {

    public void convertBinary() {

        List<String> binary = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("binary one : " +Integer.toBinaryString(number));
    }
}
