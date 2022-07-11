package ca.ciccc.assignment4.question2;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
/*
Write a method which lets the user enter English words. The user can keep entering
English words as long as the user has not entered the word “exit”. Once the user enters
“exit” the method will return and print the list of all distinct words starts with English
alphabets. Like:
A: Ali, apple, ...
B: Bob, book
... until Z
 */
    public void invoke(){
        askWords();
    }

    public void askWords(){
        boolean keepAsking = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter words ... :  for exit please enter 'exit' : ");
        String word = "";
        Set<String> listOfWords = new HashSet<>();
        while (keepAsking){
            word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")){
                keepAsking = false;
            }else{
                System.out.println("Enter new word : ");
                listOfWords.add(word);
            }
        }
        for (String wordIn: listOfWords){
          String lower =   wordIn.toLowerCase(Locale.ROOT);
            if (lower.startsWith("a")){
                System.out.println("A : " + lower);
            }else if (lower.startsWith("b")){
                System.out.println("B : " + lower);
            }else if (lower.startsWith("c")){
                System.out.println("C : " + lower);
            }else if (lower.startsWith("d")){
                System.out.println("D : " + lower);
            }else if (lower.startsWith("e")){
                System.out.println("E : " + lower);
            }else if (lower.startsWith("f")){
                System.out.println("F : " + lower);
            }else if (lower.startsWith("g")){
                System.out.println("G : " + lower);
            }else if (lower.startsWith("h")){
                System.out.println("H : " + lower);
            }else if (lower.startsWith("j")){
                System.out.println("J : " + lower);
            }else if (lower.startsWith("k")){
                System.out.println("K : " + lower);
            }else if (lower.startsWith("l")){
                System.out.println("L : " + lower);
            }else if (lower.startsWith("m")){
                System.out.println("M : " + lower);
            }else if (lower.startsWith("n")){
                System.out.println("N : " + lower);
            }else if (lower.startsWith("o")){
                System.out.println("O : " + lower);
            }else if (lower.startsWith("p")){
                System.out.println("P : " + lower);
            }else if (lower.startsWith("i")){
                System.out.println("I : " + lower);
            }else if (lower.startsWith("r")){
                System.out.println("R : " + lower);
            }else if (lower.startsWith("u")){
                System.out.println("U : " + lower);
            }else if (lower.startsWith("s")){
                System.out.println("S : " + lower);
            }else if (lower.startsWith("t")){
                System.out.println("T : " + lower);
            }else if (lower.startsWith("v")){
                System.out.println("V : " + lower);
            }else if (lower.startsWith("w")){
                System.out.println("W : " + lower);
            }else if (lower.startsWith("z")){
                System.out.println("Z : " + lower);
            }else if (lower.startsWith("y")){
                System.out.println("Y : " + lower);
            }else if (lower.startsWith("x")){
                System.out.println("X : " + lower);
            }
        }


    }
}
