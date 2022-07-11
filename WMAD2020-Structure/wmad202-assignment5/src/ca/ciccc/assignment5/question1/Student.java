package ca.ciccc.assignment5.question1;

import java.util.ArrayList;

public class Student {
    private String StudentId;
    private ArrayList<Integer> GradeList;
    private Integer gpa;
    private String name;

    public ArrayList<Integer> TakeNumbers(int[] GradeList) {
        ArrayList<Integer> s = new ArrayList<>();
        for(int i = 0; i < GradeList.length; i++) {
            s.add(GradeList[i]);
        }
        return s;
    }

    //Constructor
    Student(String id, int[] GradeList, String name) {
        this.StudentId = id;
        this.GradeList = TakeNumbers(GradeList);
        this.name = name;
    }

    //Constructor
    //GradeList = none
    Student(String id, String name) {
        this.StudentId = id;
        this.GradeList = new ArrayList<Integer>();
        this.name = name;
    }

    public Integer getGpa(Student s) {
        int sum = 0;
        for(int i = 0; i < s.GradeList.size(); i++) {
            sum += s.GradeList.get(i);
        }
        return this.gpa = sum / s.GradeList.size();
    }

    public ArrayList<Integer> getGradeList() {
        return this.GradeList;
    }

    public String getId() {
        return this.StudentId;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(Integer Grade) {
        this.GradeList.add(Grade);
    }

    public void ShowStudent(Student s) {
        System.out.println(s.getId());
        System.out.println(s.getGradeList());
        System.out.println(s.getName());
        System.out.println(s.getGpa(s));
    }

    public int CompareGpa(Student s1, Student s2) {
        int value1 = getGpa(s1);
        int value2 = getGpa(s2);

        if(value1 > value2) {
            return 1;
        } if(value1 == value2) {
            return 0;
        }else {
            return -1;
        }
    }
}
