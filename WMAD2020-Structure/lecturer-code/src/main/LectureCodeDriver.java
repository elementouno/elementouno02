package main;
import basics.JavaBasicis;

import java.util.Scanner;

public class LectureCodeDriver {

    public static void run(){
        System.out.println("WMAD202 Lecture Code Driver");

        //JavaBasics.isPersonAllowedToTheClub();

//        JavaBasics.evaluate(50);
//        JavaBasics.evaluate(30);
//        JavaBasics.evaluate(80);
//        JavaBasics.evaluate(60);

        //JavaBasics.calculateAverage();

        //JavaBasics.workingWithDivision();

//        String word = "Vancouver";
//        char minChar = JavaBasics.findMinimumCharacterInString(word);
//        System.out.printf("The word is %s and the minimum char is %c", word, minChar);

//        JavaBasics.isPrime(10);
//        JavaBasics.isPrime(23);
//        JavaBasics.isPrime(2);
//        JavaBasics.isPrime(3);


        int result = JavaBasicis.add1();
        System.out.println(result);

        result = JavaBasicis.add2();
        System.out.println(result);

        result = JavaBasicis.add3(4,5);
        result = JavaBasicis.add3(14,15);
        result = JavaBasicis.add3(10,20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        result = JavaBasicis.add3(number1,number2);
    }
}
