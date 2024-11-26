class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class ArgumentChecker {
    public void checkArgument(int argument) throws MyException {
        if (argument > 10) {
            throw new MyException("Argument is greater than 10");
        }
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        ArgumentChecker checker = new ArgumentChecker();
        try {
            checker.checkArgument(15);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
