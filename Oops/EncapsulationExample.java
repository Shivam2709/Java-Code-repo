package Oops;

class encap {
    private int age; // data hiding
    private String name;

    public void setAge(int age) { // data abstraction.
        if(age > 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        encap example = new encap();
        example.setAge(20);
        example.setName("John Doe");
        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());
    }
}
