import java.util.Scanner;

class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter roll number: ");
            int rollNumber = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter marks in subject 1: ");
            int marks1 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter marks in subject 2: ");
            int marks2 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter marks in subject 3: ");
            int marks3 = Integer.parseInt(scanner.nextLine());
            
            int totalMarks = marks1 + marks2 + marks3;
            double percentage = (totalMarks / 3.0);
            
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else if (percentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values for roll number and marks.");
        } finally {
            scanner.close();
        }
    }
}

