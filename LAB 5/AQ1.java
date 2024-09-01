import java.util.Scanner;

class Result {
    private int[][] marks;
    private int[] totalMarks;

    public Result(int numStudents, int numSubjects) {
        marks = new int[numStudents][numSubjects];
        totalMarks = new int[numStudents];
    }

    public void storeMarks() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
    }

    public void calculateTotalMarks() {
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks[i] += marks[i][j];
            }
        }
    }

    public void findHighestMarks() {
        int[] highestMarks = new int[marks[0].length];
        int[] highestRollNumbers = new int[marks[0].length];

        for (int j = 0; j < marks[0].length; j++) {
            highestMarks[j] = marks[0][j];
            highestRollNumbers[j] = 1;

            for (int i = 1; i < marks.length; i++) {
                if (marks[i][j] > highestMarks[j]) {
                    highestMarks[j] = marks[i][j];
                    highestRollNumbers[j] = i + 1;
                }
            }
        }

        System.out.println("Highest marks in each subject:");
        for (int j = 0; j < marks[0].length; j++) {
            System.out.println("Subject " + (j + 1) + ": " + highestMarks[j] + " (Roll No. " + highestRollNumbers[j] + ")");
        }
    }

    public void findHighestTotalMarks() {
        int highestTotal = totalMarks[0];
        int highestRollNumber = 1;

        for (int i = 1; i < totalMarks.length; i++) {
            if (totalMarks[i] > highestTotal) {
                highestTotal = totalMarks[i];
                highestRollNumber = i + 1;
            }
        }

        System.out.println("Student with highest total marks: Roll No. " + highestRollNumber + " (Total marks: " + highestTotal + ")");
    }
}

class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        Result result = new Result(numStudents, numSubjects);

        result.storeMarks();
        result.calculateTotalMarks();
        result.findHighestMarks();
        result.findHighestTotalMarks();
    }
}
