package Questions;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        pattern1(4);
        System.out.println("Pattern 2");
        pattern2(5);
        System.out.println("Pattern 3");
        pattern3(6);
        System.out.println("Pattern 4");
        pattern4(3);
        System.out.println("Pattern 5");
        pattern5(5);
        System.out.println("Pattern 6");
        pattern6(5);
        System.out.println("Pattern 7");
        pattern7(5);
        System.out.println("Pattern 8");
        pattern8(5);
        System.out.println("Pattern 9");
        pattern9(5);
        System.out.println("Pattern 10");
        pattern10(5);


    }
     static void pattern1(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

     static void pattern2(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col +" ");
            }
            System.out.println(" ");
        }
    }

    static void pattern3(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

     static void pattern4(int n) {
        for(int row = 1; row <= n; row++){
            // Here (n - row +1) is number of row - no of blank space need and + 1 .
            for(int col = 1; col <= n- row +1 ; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    static void pattern5(int n ){
        for(int row =1; row<= n; row++){
            for(int col =1; col<= n; col++){
                if(row ==1 || row == n || col ==1 || col == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row =1; row <= n; row++){ // Traversing over the rows.
            // print n - row  space.
            for(int col =1; col <= n-row; col++){
                System.out.print(" ");
            }
            // print 2*row -1
            for(int k = 1; k <= 2*row-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row =1; row <= n; row++){
            for(int col = row; col <= n; col++){
                System.out.print(col);
            }
            for(int k = 1; k <= row-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    static  void pattern8(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if((row + col) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int row =1; row <= n; row++){ // Traversing over the rows.
            // print n - row  space.
            for(int col =1; col <= n-row; col++){
                System.out.print(" ");
            }
            // print 1 to i
            for(int k = 1; k <= row; k++){
                System.out.print(k);
            }
            // print i-1 to 1
            for(int l = row -1; l >= 1; l--){
                System.out.print(l);
            }

            System.out.println();
        }
    }

    static  void pattern10(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n- row; col++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*row -1) ;k++) {
                if (k == 1 || row == n || k == (2 * row - 1)) {
                    System.out.print(row);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
