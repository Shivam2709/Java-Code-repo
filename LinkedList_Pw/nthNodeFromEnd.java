package LinkedList_Pw;

public class nthNodeFromEnd {
   // Formula for this is nthNode = (Size of linkedList - given index + 1);
    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while(temp!= null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        //mth node from start.
        temp = head;
        for(int i =0; i <m-1; i++){
            temp = temp.next;
        }
        return temp;
    }
    // optimized method.

    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for(int i =0; i < n; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    // remove nth node from the end of linked list.
    public static Node removeNode(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i =0; i < n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // Display linkedList

    public static void Display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node (100);
        Node b = new Node (13);
        Node c = new Node (4);
        Node d = new Node (16);
        Node e = new Node (12);
        Node f = new Node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Display(a);
        a = removeNode(a,2);
        Display(a);
//        Node temp = nthNode(a, 4);
//        System.out.println(temp.data);

//        Node q = nthNode2(a,3);
//        System.out.println(q.data);
    }
}
