import java.util.Scanner;

class Employee {
    String name;
    String city;
    double bs;
    double DA;
    double HRA;

    void getdata(String n, String c, double b, double da, double hra) {
        name = n;
        city = c;
        bs = b;
        DA = da;
        HRA = hra;
    }

    double calculate() {
        return bs + (bs * DA / 100) + (bs * HRA / 100);
    }

    void display() {
        System.out.println("Total salary for " + name + ": " + calculate());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter b salary: ");
        double bs = sc.nextDouble();

        System.out.print("Enter DA percent: ");
        double DA = sc.nextDouble();

        System.out.print("Enter HRA percent: ");
        double HRA = sc.nextDouble();

        Employee emp = new Employee();
        emp.getdata(name, city, bs, DA, HRA);
        emp.display();

        sc.close();
    }
}
