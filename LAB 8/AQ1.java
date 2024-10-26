import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);

        System.out.print("Enter the base and height of the triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);

        System.out.println("Area of the square: " + square.calculateArea());
        System.out.println("Area of the triangle: " + triangle.calculateArea());

        scanner.close();
    }
}
