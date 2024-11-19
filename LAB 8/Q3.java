interface Shape {
    double area();
}

class Rectangle implements Shape {
     double length;
     double width;

     Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

     double area() {
        return length * width;
    }
}

class Circle implements Shape {
     double radius;

     Circle(double radius) {
        this.radius = radius;
    }

     double area() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
     public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of circle: " + circle.area());
    }
}
