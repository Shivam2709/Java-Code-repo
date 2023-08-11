package Oops;

public class Encapsulation {
static class Empolyee{

    // hidding data.
     private int empid;
// modify and update the data.
    public  void setEmpid(int ide) {
        empid = ide;
    }
// view the data.
    public int getEmpid(){
        return empid;
    }
}
static class company{
    public static void main(String[] args) {
        Empolyee e = new Empolyee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}
}
