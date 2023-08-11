package Oops;

class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
    //  assign them to variables of the Animal class
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound(); // prints "Woof!"
        animal2.makeSound(); // prints "Meow!"
    }
}

