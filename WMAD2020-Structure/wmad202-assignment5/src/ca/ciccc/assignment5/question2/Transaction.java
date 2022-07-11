package ca.ciccc.assignment5.question2;

public class Transaction {
    private String id;
    private Float balance;

    Transaction(String id, Float balance) {
        this.id = id;
        this.balance = balance;
    }

    public Float SeeBalance() {
        return balance;
    }
}
