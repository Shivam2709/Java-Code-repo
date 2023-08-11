package Oops;

class Overloading{
    public void add(){
        int a =10, b = 20, c;
        c = a + b;
        System.out.println(c);
    }
    public void add(int x, int y){
        int c;
        c = x + y;
        System.out.println(c);
    }
    public void add(int x, double y){
        double c;
        c = x + y;
        System.out.println(c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.add();
        obj.add(20, 30);
        obj.add(20, 30.46);
    }
}
