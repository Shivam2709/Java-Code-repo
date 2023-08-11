package Oops;

interface Z {
    //  1st methods to call private method is create a default methods in same class.
    // 2ns method is create public static methods in same class. where private methods is created.
    default void call(){
        add(30, 20);
    }

    private void add(int x, int y){
        System.out.println("Sum of Two numbers: "+(x+y));
    }
}
class Y implements Z{
    public void sub(int x, int y){
        System.out.println("Sub of Two NumberS: "+(x-y));
    }
}
public class PrivateMethod_Interface {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.call();
        obj.sub(30, 20);
    }
}
