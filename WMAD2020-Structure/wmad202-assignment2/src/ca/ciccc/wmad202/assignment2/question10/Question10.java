package ca.ciccc.wmad202.assignment2.question10;

import java.util.Random;
import java.util.Scanner;

public class Question10 {

    public void invoke(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        Random random = new Random();
        int T = random.nextInt(Integer.MAX_VALUE - 3) + 3;
        boolean check = false ;
        if(number < T) {
            check = fx1(number) < fx2(number);
            System.out.println("(x) bigger than T and F1(x)< F2(x) is : " + check);
        }else {
            check = fx1(number) > fx2(number);
            System.out.println("(x) smaller than T and F1(x) > F2(x) is : " + check);
        }
    }
    private double fx1(int number){
        return Math.pow(2,number);
    }
    private double fx2(int number){
        return Math.pow(number,5);
    }
}
