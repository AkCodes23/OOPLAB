class Student_Detail {
   
    String name;
    int id;
    static String college_name = "MIT";


    Student_Detail(String name, int id) {
        this.name = name;
        this.id = id;
    }

   
    void display_details() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("College Name: " + college_name);
    }

    
    public static void main(String[] args) {
        
        Student_Detail student1 = new Student_Detail("Akhil", 101);
        Student_Detail student2 = new Student_Detail("suraj", 102);

        
        student1.display_details();
        System.out.println();
        student2.display_details();
    }
}
