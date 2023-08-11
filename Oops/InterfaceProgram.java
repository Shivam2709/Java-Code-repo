package Oops;
interface customer{
   int amt = 5; // public + static + final
    void purchase(); // public + abstract
}

class seller implements customer{
    @Override
    public void purchase(){
        // amt = 5 is final.
        System.out.println("customer needs "+amt+" kg rice");
    }
}
public class InterfaceProgram {
    public static void main(String[] args) {
        customer  cu = new seller();
        cu.purchase();
        System.out.println(customer.amt); // amt is static also.
    }
}
