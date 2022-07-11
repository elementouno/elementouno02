package ca.ciccc.assignment5.question2;

public class Student {
    private String text;
    private String textAnwser;

    Student(String text, String textAnwser) {
        this.text = text;
        this.textAnwser = textAnwser;
    }

    public void ask() {
        MultiplyChoice mc = new MultiplyChoice();
        mc.ShowQuestion(text);
    }

    public void printAnswer() {
        MultiplyChoice mc = new MultiplyChoice();
        mc.ShowTheAnwser(textAnwser);
    }
}
