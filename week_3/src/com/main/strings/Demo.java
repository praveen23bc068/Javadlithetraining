package com.main.strings;

public class Demo {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.accountno);
        System.out.println(b.balance);
        b.setData(69);
        System.out.println(b.getData());
        b.deposit(69,10000.00);
        b.withdraw(69,10000);
        b.checkBalance(69);
    }
}
