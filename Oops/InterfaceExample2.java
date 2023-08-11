package Oops;

interface shape {
    double getArea();
    double getPerimeter();
}

class rectangle implements shape {
    double width;
    double height;

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle implements shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        shape rect = new rectangle(5, 10);
        shape crcl = new Circle(5);
        System.out.println("Area of rectangle : " + rect
                .getArea());
        System.out.println("Area of rectangle : " + rect.getPerimeter());
        System.out.println("Area of circle : " + crcl.getArea());
        System.out.println("Perimeter of circle : " + crcl.getPerimeter());
    }
}
