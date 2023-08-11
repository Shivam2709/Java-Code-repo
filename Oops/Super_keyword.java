package Oops;


class superClass {
    int a = 10;
    public void sho(){
        System.out.println("Hello viewer");
    }
}

class subClass extends superClass {
    int a = 20;
    public void Sho() {
        System.out.println(a);
        System.out.println(super.a);
        super.sho();
        System.out.println("Hello Learner");
    }
}
public class Super_keyword {
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.Sho();
    }
}
