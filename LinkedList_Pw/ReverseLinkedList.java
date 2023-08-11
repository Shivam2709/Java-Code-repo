package LinkedList_Pw;

public class ReverseLinkedList {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }

    public static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node present = head;
        Node n = present.next;

        while( present != null) {
            present.next = prev;
            prev = present;
            present = n;

            if(n != null) {
                n = n.next;
            }
        }
        return prev;
    }
    public static void reverseUsingRecursion(Node head){
        if(head == null) return; // base case
        reverseUsingRecursion(head.next); // call
        System.out.print(head.val+" "); // work
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        display(a);
//         a = reverse(a);
//         display(a);

        // recursion method
        reverseUsingRecursion(a);
    }
}
