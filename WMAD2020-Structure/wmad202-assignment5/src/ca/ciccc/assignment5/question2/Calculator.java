package ca.ciccc.assignment5.question2;

public class Calculator {
    private Integer n1;
    private Integer n2;
    private String Operator;
    private Integer result;

    Calculator(Integer n1, Integer n2, String operator) {
        this.n1 = n1;
        this.n2 = n2;
        this.Operator = operator;
        this.result = 0;
    }

    public void Operation() {
        if(Operator == "+") {
            this.result = n1 + n2;
            System.out.println(result);
        }
        else if(Operator == "-") {
            this.result = n1 - n2;
            System.out.println(result);
        }
        else if(Operator == "x") {
            this.result = n1 * n2;
            System.out.println(result);
        }
        else if(Operator == "/") {
            this.result = n1 / n2;
            System.out.println(result);
        }
    }
}
