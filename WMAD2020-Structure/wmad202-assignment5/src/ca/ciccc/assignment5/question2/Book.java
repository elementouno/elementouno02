package ca.ciccc.assignment5.question2;

import java.util.ArrayList;

public class Book {
    private ArrayList<Pages> PagesList;

    Book() {
        this.PagesList = new ArrayList<Pages>();
    }
    Book(ArrayList<Pages> p) {
        this.PagesList = p;
    }
    public void CheckWords(String word) {
        int num = 0;
        for(int i = 0; i < PagesList.size(); i++) {
            Pages p = PagesList.get(i);
            // split the string by spaces in a
            String a[] = p.word.split(" ");
            for(int j = 0; j < PagesList.size(); j++) {
                if(word.equals(a[j])) {
                    num++;
                }
            }
        }
        System.out.println("Number of ocurences: " + num);
    }
    public void addPage(Pages p) {
        PagesList.add(p);
    }
}
