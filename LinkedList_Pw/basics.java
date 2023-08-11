package LinkedList_Pw;

public class basics {
    public static class Node {
        int data; // value
        Node next; // address of next node.
        // Constructor of Node class
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b; // 5 ->3 9 8 16
        b.next = c; // 5 -> 3 ->9 8 16
        c.next = d; // 5 -> 3 -> 9 ->8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 ->16

        Node temp = a;
        while (temp != null){ // printing the list.
            System.out.print(temp.data+ " ->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}
