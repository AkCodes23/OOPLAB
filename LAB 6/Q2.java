class Student {
    String regNo;
    String name;
    int age;

    Student(String regNo, String name, int age) {
        this.regNo = regNo;
        this.name = name;
        this.age = age;
    }
}

class UGStudent extends Student {
    int semester;
    double fees;
    static int totalUGAdmissions = 0;

    UGStudent(String regNo, String name, int age, int semester, double fees) {
        super(regNo, name, age);
        this.semester = semester;
        this.fees = fees;
        totalUGAdmissions++;
    }

    void display() {
        System.out.println("UG Student - RegNo: " + regNo + ", Name: " + name + ", Age: " + age + ", Semester: " + semester + ", Fees: " + fees);
    }
}

class PGStudent extends Student {
    int semester;
    double fees;
    static int totalPGAdmissions = 0;

    PGStudent(String regNo, String name, int age, int semester, double fees) {
        super(regNo, name, age);
        this.semester = semester;
        this.fees = fees;
        totalPGAdmissions++;
    }

    void display() {
        System.out.println("PG Student - RegNo: " + regNo + ", Name: " + name + ", Age: " + age + ", Semester: " + semester + ", Fees: " + fees);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        UGStudent ug1 = new UGStudent("UG001", "Akhil", 18, 1, 50000);
        UGStudent ug2 = new UGStudent("UG002", "Suraj", 19, 2, 55000);
        PGStudent pg1 = new PGStudent("PG001", "anant", 22, 1, 75000);
        PGStudent pg2 = new PGStudent("PG002", "noclue", 23, 2, 80000);

        System.out.println("UG Students:");
        ug1.display();
        ug2.display();
        System.out.println("Total UG Admissions: " + UGStudent.totalUGAdmissions);

        System.out.println("PG Students:");
        pg1.display();
        pg2.display();
        System.out.println("Total PG Admissions: " + PGStudent.totalPGAdmissions);
    }
}
