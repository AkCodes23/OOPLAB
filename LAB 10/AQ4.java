class MarkOutOfBoundsException extends Exception {
    public MarkOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {
    int mark;

    public Student(int mark) throws MarkOutOfBoundsException {
        if (mark > 100) {
            throw new MarkOutOfBoundsException("Mark cannot be greater than 100.");
        }
        this.mark = mark;
    }
}

public class MarkCheck {
    public static void main(String[] args) {
        try {
            Student student = new Student(120);
            // ... (use the student object)
        } catch (MarkOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
