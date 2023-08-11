package Oops;

interface Vehicle {
    public void start();
    public void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
