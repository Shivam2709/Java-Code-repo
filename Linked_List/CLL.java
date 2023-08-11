package Linked_List;

public class CLL {

    private Node head;
    public Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void delete(int val){
        Node newNode = head;
        if(newNode == null){
            return;
        }

        if(newNode.data == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node temp = newNode.next;
            if(temp.data == val){
                newNode.next = temp.next;
                break;
            }
            newNode = newNode.next;
        }while(newNode != head);
    }
    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("HEAD");
    }
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
