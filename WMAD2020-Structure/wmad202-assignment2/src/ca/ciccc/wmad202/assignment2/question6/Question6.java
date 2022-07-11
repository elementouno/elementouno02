package ca.ciccc.wmad202.assignment2.question6;

import java.util.Scanner;

public class Question6 {

    public void invoke(){
        boolean stopAsking = true;
        while (stopAsking){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a statement : ");
            String input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++){
                if(!(input.length() == i + 1)){
                    if(Character.isAlphabetic(input.charAt(i))){
                        if(Character.isAlphabetic(input.charAt(i+1))){

                            if(input.charAt(i) == '('){
                                if(input.charAt(i+1) == '('){
                                    stopAsking = true;
                                }
                            }else if(input.charAt(i) == ')'){
                                if(input.charAt(i+1) == ')'){
                                    stopAsking = true;
                                }
                            }else {
                                stopAsking = false;
                                System.out.println("There is multiple char");
                            }
                        }
                    }
                }
            }
                System.out.println("input : "+ input);
        }
    }
}
