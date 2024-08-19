class Employee {
    String name;
    String city;
    double basicSalary;
    double daPercent;
    double hraPercent;

    // Method to get data
    void getdata(String n, String c, double basic, double da, double hra) {
        name = n;
        city = c;
        basicSalary = basic;
        daPercent = da;
        hraPercent = hra;
    }

    // Method to calculate total salary
    double calculate() {
        return basicSalary + (basicSalary * daPercent / 100) + (basicSalary * hraPercent / 100);
    }

    // Method to display total salary
    void display() {
        System.out.println("Total salary for " + name + ": " + calculate());
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getdata("John Doe", "New York", 50000, 10, 15);
        emp.display();
    }
}
