package ca.ciccc.wmad202.assignment2.question7;

import java.util.Scanner;

public class Question7 {
    /*
    Write a Java program which asks the user for a number which is the length of the side of
a square. The program should find the area of a circle which is crossing from all corners
of the square.
- 44
3 4 5
A=π.r2
     */

    public double findCircleAreaFromInsideSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        int side = scanner.nextInt();

        return Math.PI*side*2;
    }

}
