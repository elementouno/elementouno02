package ca.ciccc.wmad202.assignment2.question2;

import java.util.Scanner;

public class Question2 {

    public void invoke(){
        System.out.println("enter number : ");
        int reverse = 0;
        while (true){
            try {
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                System.out.println("invalid. re-enter : ");
                if(number % 10 != 0) {

                    while(number != 0) {
                        int remainder = number % 10;
                        reverse = reverse * 10 + remainder;
                        number = number/10;
                    }
                    System.out.println(" reverse of number + "+ reverse);
                    break;
                }
            }catch (Exception e){
                break;
            }
        }
    }
}
