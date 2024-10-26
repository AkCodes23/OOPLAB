import java.util.Arrays;

class Student {
    int registrationNumber;
    String firstName, lastName, degree;

    public Student(int registrationNumber, String firstName, String lastName, String degree) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }
}

public class SearchStudent {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        // Populate the array with student objects (not shown here)
        String searchName = "Alice"; // Search by first name

        boolean found = false;
        for (Student student : students) {
            if (student.firstName.equals(searchName) || student.lastName.equals(searchName)) {
                System.out.println("Student found:");
                System.out.println("Registration Number: " + student.registrationNumber);
                System.out.println("First Name: " + student.firstName);
                System.out.println("Last Name: " + student.lastName);
                System.out.println("Degree: " + student.degree);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
