package Oops;

class shop{
     public void draw(){
        System.out.println("Can't Say shape type");
    }
}
class Sqr extends shop{
     public  void draw(){
         super.draw();
        System.out.println("Square Shape");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        shop ob = new Sqr();
        ob.draw();
    }
}
