package Oops;

public class Abstraction {
 // Hidding the details of the class.
    // if we create a abstract method in any class then its mandatory to declare that class is abstract.
   static abstract class Vehicale{
        abstract void start();
    }
 // showing the details of the abstract class in other class.
 // if any class is extends the abstract class then mention the abstract class methode are also hear.
   static class car extends Vehicale{
        void start(){
            System.out.println("Car start with key.!");
        }
    }
   static class scooter extends Vehicale{
        @Override
        void start() {
            System.out.println("Scooter starts with kick.!");
        }
    }

    public static void main(String[] args) {
    // we cannot create object of abstract class.
        Vehicale c = new car();
        c.start();
        Vehicale s = new scooter();
        s.start();
    }
}
