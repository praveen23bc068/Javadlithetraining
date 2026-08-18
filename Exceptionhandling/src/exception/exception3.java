package exception;

public class exception3 {
    public static void main(String[] args) {
        int age=-5;
        if(age<0){
            throw new ArithmeticException("Age cannot be negative");
        }
        System.out.println("valid age");
    }
}
