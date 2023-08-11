package Oops;

interface Cli1{
     abstract void add();
}

interface Cli2 extends Cli1{
   abstract void sub();
}
 class funcnality implements Cli2{
    @Override
    public void add(){
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println("Addition "+ c);
    }
    @Override
    public void sub() {
        int a = 20, b = 10, c;
        c = a - b;
        System.out.println("Subtraction "+ c);
    }
}

public class ExtendingInterface {
    public static void main(String[] args) {
        Cli2 cl = new funcnality();
        cl.add();
        cl.sub();
    }
}
