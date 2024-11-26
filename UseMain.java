class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class MyClass {
    public void checkArgument(int argument) throws MyException {
        if (argument > 10) {
            throw new MyException("Argument is greater than 10");
        }
    }
}

public class UseMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        try {
            myClass.checkArgument(15);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}