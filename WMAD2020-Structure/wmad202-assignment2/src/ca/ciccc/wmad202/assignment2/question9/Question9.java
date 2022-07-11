package ca.ciccc.wmad202.assignment2.question9;

import java.util.Locale;
import java.util.Scanner;

public class Question9 {
    /*
    Write a Java program which keeps asking the user to enter a name. The program checks
the entered name. If the entered name contains any digit, then the program terminates, if
the entered name has no digits and only contains alphabets, then converts the name to
uppercase and prints it and asks for the next name from the user and repeats.
     */
    public void invoke(){
        boolean stopAsking = true;
        boolean containNumber = false;
        while (stopAsking){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a name without number : ");
            String input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++){
                if(Character.isDigit(input.charAt(i))){
                    stopAsking = false;
                    containNumber = true;
                }
            }
            if(!containNumber){
                System.out.println(input.toUpperCase(Locale.ROOT));
            }
        }
    }
}
