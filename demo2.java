// Interface to show details
interface ShowDetails {
    void showName();
    void showAge();
}

// Interface to show marks
interface ShowMarks {
    void showMathMarks();
    void showScienceMarks();
}

// Child class implementing both interfaces
class ShowResult implements ShowDetails, ShowMarks {
    private String name;
    private int age;
    private int mathMarks;
    private int scienceMarks;

    // Constructor
    public ShowResult(String name, int age, int mathMarks, int scienceMarks) {
        this.name = name;
        this.age = age;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
    }

    // Implementing ShowDetails interface methods
    @Override
    public void showName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void showAge() {
        System.out.println("Age: " + age);
    }

    // Implementing ShowMarks interface methods
    @Override
    public void showMathMarks() {
        System.out.println("Math Marks: " + mathMarks);
    }

    @Override
    public void showScienceMarks() {
        System.out.println("Science Marks: " + scienceMarks);
    }

    // Displaying all details
    public void displayDetails() {
        showName();
        showAge();
        showMathMarks();
        showScienceMarks();
    }
}

// Main class to test the implementation
public class demo2{
    public static void main(String[] args) {
        ShowResult result = new ShowResult("kamalakanta Rout", 18, 90, 85);
        result.displayDetails();
    }
}
