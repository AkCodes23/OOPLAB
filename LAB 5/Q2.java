import java.util.Scanner;

class Employee {
    String name;
    String city;
    double basicSalary;
    double daPercent;
    double hraPercent;

    void getdata(String n, String c, double basic, double da, double hra) {
        name = n;
        city = c;
        basicSalary = basic;
        daPercent = da;
        hraPercent = hra;
    }

    double calculate() {
        return basicSalary + (basicSalary * daPercent / 100) + (basicSalary * hraPercent / 100);
    }

    void display() {
        System.out.println("Total salary for " + name + ": " + calculate());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter DA percent: ");
        double daPercent = scanner.nextDouble();

        System.out.print("Enter HRA percent: ");
        double hraPercent = scanner.nextDouble();

        Employee emp = new Employee();
        emp.getdata(name, city, basicSalary, daPercent, hraPercent);
        emp.display();

        scanner.close();
    }
}
