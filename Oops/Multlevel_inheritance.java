package Oops;

import java.util.Scanner;

public class Multlevel_inheritance {
    public static class A{
         static void add(){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter value of a");
             int a = sc.nextInt();
             System.out.println("Enter value of b");
             int b = sc.nextInt();
             int c = a + b;
            System.out.println("Sum of two numbers: "+c);

        }
    }
    public  static class b extends A {
        static void sub(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of a");
            int a = sc.nextInt();
            System.out.println("Enter value of b");
            int b = sc.nextInt();
            int c = b - a;
            System.out.println("Sub of two number: "+ c);
        }
    }
    public static class c extends b {
        static void mult(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of a");
            int a = sc.nextInt();
            System.out.println("Enter value of b");
            int b = sc.nextInt();
            int c = a * b;
            System.out.println("Multi of two number : "+ c );
        }
    }

    public static void main(String[] args) {
        c ob = new c();
        ob.add();
        ob.sub();
        ob.mult();


    }
}
