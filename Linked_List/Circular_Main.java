package Linked_List;

public class Circular_Main {
    public static void main(String[] args) {
        CLL clist = new CLL();
        clist.insert(8);
        clist.insert(6);
        clist.insert(2);
        clist.insert(4);
        clist.insert(1);
        clist.insert(7);
        clist.delete(4);

        clist.display();
    }
}
