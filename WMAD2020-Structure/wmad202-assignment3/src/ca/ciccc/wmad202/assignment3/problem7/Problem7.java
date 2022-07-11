package ca.ciccc.wmad202.assignment3.problem7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Problem7 {
    /**Define and implement a function which does Linear Search. This function receives two
     input parameters, one is a list of integers and the other one is a number to search for. The
     method returns -1 (negative one) if the number (the second parameter of the function)
     does not exist in the list or returns the index of the number if the number exists in the list.
     -If there are more than one occurrence of the number, the function will return the index of
     the first occurrence*/
    public static int SearchNumber(ArrayList<Integer> arrayL, int Number) {
        int x = -1;
        if (arrayL.contains(Number)) {
            x = arrayL.indexOf(Number);
        }
        return x;
    }
    public static void Test(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(1);
        numberList.add(2);
        numberList.add(2);
        numberList.add(4);
        int searchNumber = 4;
        /*
        System.out.println("Please enter the number: ");
        int number1 = scanner.nextInt();
        numberList.add(number1);

        while(number1 != 0){
            System.out.println("Please enter the number again (0 : stop): ");
            number1 = scanner.nextInt();
            if(number1 != 0){
                numberList.add(number1);
            }
        }

        System.out.println("Please enter one number to find: ");
        int searchNumber = scanner.nextInt(); */

        if(SearchNumber(numberList, searchNumber) == -1) {
            System.out.println("DIDNT FIND!");
        } else {
            System.out.println("Index:" + SearchNumber(numberList, searchNumber));
        }
    }
}
