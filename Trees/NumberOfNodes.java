package Trees;


class node {
    int data;
    node  left, right;
    node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

class NumberOfNodes{
    static void inOrderTrav(node  curr, int count[]) {
        if (curr == null)
            return;

        count[0]++;
        inOrderTrav(curr . left, count);
        inOrderTrav(curr . right, count);
    }

    public static void main(String args[]) {

        node  Root = new node(1);
        Root . left = new node(2);
        Root . right = new node(3);
        Root . left . left = new node(4);
        Root . left . right = new node(5);
        Root . right . left = new node(6);

        int count[]=new int[1];
        inOrderTrav(Root, count);

        System.out.println(count[0]);
    }
}
