package Oops;

public class Interface {
    // Hidding the details of the class.
    // if we create  any methods in interface its by default a public methods.

    interface I1{
        public void show();
    }
    interface I2{
        public void display();
    }
  // implements keyword is used in extends the interface class.
  // if any class is implements the interface  then mention the interface  methode are also hear.
  // we also use multiple inheritance concept in interface.
    static class Test implements I1, I2{
        public void show(){
            System.out.println("Interface program.!");
        }

      @Override
      public void display() {
          System.out.println("Using multiple inheritance concept ");
      }
  }

    public static void main(String[] args) {
        // we cannot create object of interface class.
        Test t = new Test();
        t.show();
        t.display();
    }
}
