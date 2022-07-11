package ca.ciccc.wmad202.assignment2.problem2;

public class Problem2 {

    public void invoke(String input) {
        String nstr="";
        char ch;

        for (int i=0; i<input.length(); i++) {
            ch= input.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        if(input.equalsIgnoreCase(nstr)){
            System.out.println("input is same as reversed");
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
