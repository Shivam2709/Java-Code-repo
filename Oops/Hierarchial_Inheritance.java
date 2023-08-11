package Oops;

class M {
        public void input (){
            System.out.println("Enter Your Name ");
        }
    }
class N extends M{
        public void show (){
            System.out.println("My name is Shivam ");
        }
    }

class O extends M{
        public  void Disp() {
            System.out.println("My Name is Rajnish");
        }
    }
public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        O obj = new O();
        obj.input();
        obj.Disp();
        N ob = new N();
        ob.input();
        ob.show();

    }

}
