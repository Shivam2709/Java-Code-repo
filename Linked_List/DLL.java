package Linked_List;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;

    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        Node temp = head;

        newNode.next = null;

        if(head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
            while( temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;

    }
    public Node find(int value){  // time complexity O(n)
        Node currNode = head;
        while(currNode != null){
            if(currNode.data == value){
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
    }

    public void insert(int after, int val ) {
        Node p = find(after);

        if(p == null){
            System.out.println("Does not exist");
            return;
        }
        Node newNode = new Node(val);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }

    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.data +" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("Null");

        System.out.println("Print in Revers");
        while(last != null){
            System.out.print(last.data+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
