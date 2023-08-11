package Oops;

abstract class ShaPe {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class RectAngle extends ShaPe {
    double width;
    double height;

    public RectAngle(double width, double height) {
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

class CirCle extends ShaPe {
    double radius;

    public CirCle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class  AbstractionExample{
    public static void main(String[] args) {
        ShaPe rectangle = new RectAngle(5, 10);
        ShaPe circle = new CirCle(5);
        System.out.println("Area of rectangle : " + rectangle.getArea());
        System.out.println("Perimeter of rectangle : " + rectangle.getPerimeter());
        System.out.println("Area of circle : " + circle.getArea());
        System.out.println("Perimeter of circle : " + circle.getPerimeter());
    }
}
