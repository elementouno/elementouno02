package ca.ciccc.assignment5.question1;

import java.util.ArrayList;

public class Test {
    public void TestStudents() {
        Student s1 = new Student("77889911", new int[]{80, 78, 65, 34},"Dave");
        Student s2 = new Student("66553322", new int[]{},"James");

        s2.addGrade(87);
        s2.addGrade(63);
        s2.addGrade(45);
        s2.addGrade(91);

        System.out.println(s1.getGpa(s1));
        System.out.println(s2.getGpa(s2));

        if(s1.CompareGpa(s1, s2) == 0) {
            System.out.println("EQUAL");
        }
        else if(s1.CompareGpa(s1, s2) == 1) {
            System.out.println("THE FIRST ONE IS BIGGER");
        } else {
            System.out.println("THE SECOND ONE IS BIGGER");
        }
    }
}
