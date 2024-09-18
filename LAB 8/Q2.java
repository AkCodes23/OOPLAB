abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
     double length;
     double width;

     Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

     double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
     double radius;

     Circle(double radius) {
        this.radius = radius;
    }

     double getArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Area of circle: " + circle.getArea());
    }
}
