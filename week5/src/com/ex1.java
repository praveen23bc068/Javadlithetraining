package com;

public class ex1 {
    public static void main(String[] args) {
        int age = 19;

        try {
            if (age < 18) {
                throw new Exception("Something went wrong");
            } else {
                System.out.println("Eligible to vote");
            }
        } catch (Exception e) {
            System.out.println("Caught" + e.getMessage());
        }
    }
}