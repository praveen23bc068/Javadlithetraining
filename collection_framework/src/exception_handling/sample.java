package exception_handling;


class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg) {
        super(msg);
    }
}
public class sample {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(("Age is invalid , must be above 18"));
        } else {
            System.out.println("VALID AGE");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("End of the progress");
        }
    }
}

