package com.main.strings;
//encapsulation
 class Bank {
    private int pin=69;
    String accountno = "696969";
    Double balance = 100000.00;
    int amount;

    public void setData(int u_pin) {
        pin = u_pin;
    }

    public int getData() {
        return pin;
    }

    void deposit(int pin,double amount) {
        if (this.pin == pin) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid pin");
        }
    }

    void withdraw(int pin,double amount) {
        if (this.pin == pin) {
            if (amount > balance) {
                System.out.println("Insuffecient balannce");
            } else {
                balance -= amount;
                System.out.println("Amount withdrawn successfully");
            }
        } else {
            System.out.println("Invalid pin");
        }
    }

    void checkBalance(int pin) {
        if (this.pin == pin) {
            System.out.println("Current Balance:" + balance);
        } else {
            System.out.println("Invalid pin");
        }
    }
}
