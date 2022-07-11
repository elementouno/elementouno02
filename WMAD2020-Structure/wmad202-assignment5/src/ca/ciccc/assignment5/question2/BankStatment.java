package ca.ciccc.assignment5.question2;

import java.util.ArrayList;

public class BankStatment {
    private ArrayList<Transaction> TransactionList;

    BankStatment() {
        this.TransactionList = new ArrayList<Transaction>();
    }

    public void addTransction(Transaction t) {
        TransactionList.add(t);
    }

    public void totalBalance() {
        float total = 0;
        for(int i = 0; i < TransactionList.size(); i++) {
            Transaction t = TransactionList.get(i);
            total = total + t.SeeBalance();
        }
        System.out.println("TOTAL BALANCE:" + total);
    }
}
