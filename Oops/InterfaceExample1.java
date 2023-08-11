package Oops;

import java.util.Scanner;

interface client {
     void input(); // public + abstract
     void output(); // public + abstract
}

  class InterfaceExample1 implements client {
    String name ; double sal;
     public void input(){
         Scanner r = new Scanner(System.in);
         System.out.println("Enter UserName: ");
         name = r.nextLine();

         System.out.println("Enter Salary: ");
         sal = r.nextDouble();
     }
     public void output() {
         System.out.print("Name is "+ name + " " + "Salary is "+sal);
     }

     public static void main(String[] args) {
         client c = new InterfaceExample1();
            c.input(); c.output();
     }

}
