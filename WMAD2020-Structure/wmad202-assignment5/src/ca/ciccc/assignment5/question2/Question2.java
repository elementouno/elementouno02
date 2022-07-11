package ca.ciccc.assignment5.question2;

import java.util.Scanner;

public class Question2 {
    public void invoke(){
        //TestProblem2_1();
        //TestProblem2_2();
        //TestProblem2_3();
        //TestProblem2_4();
        //TestProblem2_5();
        //TestProblem2_6();
        //TestProblem2_7();
        TestProblem2_8();
    }

    public void TestProblem2_1() {
        Invoice invoice = new Invoice();
        Product p = new Product("PASTA", 2.00F);
        invoice.addItem(p);
        Product p2 = new Product("RedBull", 4.00F);
        invoice.addItem(p2);
        Product p3 = new Product("Coca-Cola", 5.00F);
        invoice.addItem(p3);
        invoice.showList();
    }

    public void TestProblem2_2() {
        Pages pages = new Pages("LOREM LOREM");
        Book book = new Book();
        book.addPage(pages);
        Pages pages1 = new Pages("LOREM LOREM");
        book.addPage(pages1);
        book.CheckWords("LOREM");
    }

    public void TestProblem2_3() {
        Transaction t = new Transaction("999" , 2.02F);
        BankStatment b = new BankStatment();
        b.addTransction(t);
        Transaction t2 = new Transaction("999" , 2.02F);
        b.addTransction(t2);
        b.totalBalance();
    }

    public void TestProblem2_4() {
        Program p = new Program("printf(OK)");
        p.Printer();
        Program p2 = new Program("printf(OK 2)");
        p2.Printer();
    }

    public void TestProblem2_5() {
        Calculator c = new Calculator(2, 3, "+");
        c.Operation();
        Calculator c2 = new Calculator(5, 3, "-");
        c2.Operation();
        Calculator c3 = new Calculator(3, 2, "*");
        c3.Operation();
        Calculator c4 = new Calculator(6, 2, "/");
        c4.Operation();
    }

    public void TestProblem2_6() {
        Phone p = new Phone();
        p.CreateAlarmTime();
    }

    public void TestProblem2_7() {
        MultiplyChoice mc = new MultiplyChoice();
        mc.ShowQuestion("WITCH IS ANIMAL WHO STAY IN WATHER?");
        mc.giveChoices("CAT", "COW", "FISH", "DOG");
        mc.checkChoice("c", "b");
        mc.checkChoice("c", "c");
        mc.checkChoice("c", "d");
        mc.checkChoice("c", "a");
        mc.ShowTheAnwser("c");
    }

    public void TestProblem2_8() {
        Student s = new Student("WITCH IS ANIMAL WHO STAY IN WATHER?", "Fish");
        s.ask();
        s.printAnswer();
    }
}
