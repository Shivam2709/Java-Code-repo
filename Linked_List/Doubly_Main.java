package Linked_List;

public class Doubly_Main {
    public static void main(String[] args) {
        DLL Dlist = new DLL();
        Dlist.insertFirst(2);
        Dlist.insertFirst(3);
        Dlist.insertFirst(8);
        Dlist.insertFirst(17);
        Dlist.insertFirst(23);
        Dlist.insertFirst(20);
        Dlist.insertLast(99);
        Dlist.insert(17,100);

        Dlist.display();

    }
}
