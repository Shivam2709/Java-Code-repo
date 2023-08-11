package Oops;
interface a {
     void show(); // public + abstract
}
interface B{
     void show(); // public + abstract
}

 class MultipleInheritance implements a,B {
     public void show(){
         System.out.println("Interface  A & B");
     }
     public static void main(String[] args) {
         MultipleInheritance m= new MultipleInheritance();
         m.show();
     }
}
