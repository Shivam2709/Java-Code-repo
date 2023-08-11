package Linked_List;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size =0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node LastNode = new Node(val);
        tail.next = LastNode;
        tail = LastNode;
        size++;
    }
    public void insert(int val, int pos){
        if(pos == 0){
            insertFirst(val);
            return;
        }
        if(pos == size){
            insertLast(val);
            return;
        }

        Node temp = head; // crete temporary node for only reaching for thr given position.
        for(int i =1;i<pos;i++){
            temp = temp.next;
        }
        Node currNode = new Node(val, temp.next);
        temp.next = currNode;
    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size -2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){ // time complexity O(n)
        if(index ==0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.data;

        prev.next = prev.next.next;
         size--;
        return val;
    }
    // Find or Searching some value in the list.
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
    public Node get(int index){
        Node  currNode = head;
        for (int i =0;i<index;i++){
            currNode = currNode.next;
        }
        return currNode;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    // Question!!!
    // remove duplicate in the sorted linked list.
    public void duplicates(){
        Node temp = head;

        while( temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
                size--;
            }else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    // Merge two sorted linked list.

    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans =new LL();

        while(f != null && s != null){
            if(f.data <= s.data){
              ans.insertLast(f.data);
              f = f.next;
            }else{
                ans.insertLast(s.data);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.data);
            f=f.next;
        }
        while(s != null){
            ans.insertLast(s.data);
            s=s.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

       LL ans = LL.merge(first, second);
       ans.display();


    }

}
