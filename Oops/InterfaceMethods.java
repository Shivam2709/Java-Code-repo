package Oops;

interface Client{
    void webdesign(); // public + abstract
    void webdevelope(); // public + abstract
}

 abstract class RajTech implements Client {
    @Override
    public void webdesign(){
        System.out.println("Green, top menu, three dot button");
    }
} class RahulTech extends RajTech {
    @Override
    public void webdevelope(){
        System.out.println("HTML, CSS, JAVASCRPIT");
    }
}
public class InterfaceMethods {
    public static void main(String[] args) {
        RahulTech r = new RahulTech();
        r.webdesign();
        r.webdevelope();
    }
}
