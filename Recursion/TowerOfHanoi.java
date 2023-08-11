package Recursion;

// Time complexity of Tower of hanoi = O(2^n)
public class TowerOfHanoi {
    public static void hanoi(int n, String src, String help, String dest) {

        if(n == 1){
            System.out.println("Transfer disk"+ n + "from " +src+ " to "+ dest);
            return;
        }
        hanoi(n-1, src, dest, help);
        System.out.println("Transfer disk"+ n + "from " +src+ " to "+ dest);
        hanoi(n-1, help, src, dest);

    }
    public static void main(String[] args) {
        int n = 5;
        hanoi(n, "S", "H", "D");
    }
}
