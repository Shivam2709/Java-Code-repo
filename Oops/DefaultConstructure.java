package Oops;
class A {
    int a; String b; boolean c;
    A(){
        a=100; b="ankit"; c=true;
    }
    public void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
}
public class DefaultConstructure {
    class A {
        int a; String b; boolean c;
        A(){
            a=100; b="ankit"; c=true;
        }
        public void Disp(){
            System.out.println(a+" "+b+" "+c);
        }
    }
    public static void main(String[] args) {
        DefaultConstructure obj = new DefaultConstructure();

    }
}
