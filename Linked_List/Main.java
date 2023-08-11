package Linked_List;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(20);
        list.insertLast(99);
        list.insert(100, 4);
        list.display();

    }

}
