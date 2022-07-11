package ca.ciccc.wmad202.assignment2.main;

import ca.ciccc.wmad202.assignment2.question1.Question1;
import ca.ciccc.wmad202.assignment2.question10.Question10;
import ca.ciccc.wmad202.assignment2.question2.Question2;
import ca.ciccc.wmad202.assignment2.question3.Question3;
import ca.ciccc.wmad202.assignment2.question4.Question4;
import ca.ciccc.wmad202.assignment2.question5.Question5;
import ca.ciccc.wmad202.assignment2.question6.Question6;
import ca.ciccc.wmad202.assignment2.question7.Question7;
import ca.ciccc.wmad202.assignment2.question8.Question8;
import ca.ciccc.wmad202.assignment2.question9.Question9;

import java.util.Scanner;

public class Assignment2Driver {
    public static void run() {
        boolean stop = true;
        while (stop){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter question number 1-10 to show result of question");
            int question = scanner.nextInt();
            if (question == 1){
                Question1 question1 = new Question1();
                question1.readAndPrintNumberDivisible();
                stop = false;
            }else if(question == 2){
                Question2 question2 = new Question2();
                question2.invoke();
                stop = false;
            }else if(question == 3){
                Question3 question3 = new Question3();
                question3.convertBinary();
                stop = false;
            }else if(question == 4){
                Question4 question4 = new Question4();
                question4.stopInvalid();
                stop = false;
            }else if(question == 5){
                Question5 question5 = new Question5();
                question5.invoke();
                stop = false;
            }else if(question == 6){
                Question6 question6 = new Question6();
                question6.invoke();
                stop = false;
            }else if(question == 7){
                Question7 question7 = new Question7();
                System.out.println("Area of Circle = " + question7.findCircleAreaFromInsideSquare());
                stop = false;
            }else if(question == 8){
                Question8 question8 = new Question8();
                question8.monteCarlo();
                stop = false;
            }else if(question == 9){
                Question9 question9 = new Question9();
                question9.invoke();
                stop = false;
            }else if(question == 10){
                Question10 question10 = new Question10();
                question10.invoke();
                stop = false;
            }else {
                System.out.println("Please enter btw 1-10");
            }
        }

    }
}
