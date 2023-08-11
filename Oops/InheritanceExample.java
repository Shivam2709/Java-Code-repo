package Oops;
// base class
class Shape {
    int width;
    int height;

    public void setWidth(int w){
        width = w;
    }

    public void setHeight(int h){
        height = h;
    }
}
// Child class
class Rectangle extends Shape{
    public int getArea(){
        return width * height;
    }
}
// child class
class Square extends Shape{
    // override from shape class
    public void setWidth(int w){
        width = height = w;
    }

    // override from shape class
    public void setHeight(int h){
        width = height = h;
    }
    public int getArea(){
        return width * width;
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(7);
        System.out.println("Rectangle area" + " " +rect.getArea());

        Square sq = new Square();
        sq.setWidth(6);
        sq.setHeight(6);
        System.out.println("Square area" + " " +sq.getArea());
    }
}
