/*QS. Count total paths in a maze to move from (0,0) to (n,m)..!
  n and m is the size of the matrix

 */

public class Count_path_in_Matrix {
    public static int countpaths(int i, int j, int n, int m) {
        // base case

        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        // move for down
       int  downpath = countpaths(i+1, j, n, m);

        // move for right
        int rightpath = countpaths(i, j+1, n, m);

        return downpath + rightpath;

    }
    public static void main(String[] args) {
        int n =3, m =3;
        int ans = countpaths(0, 0, n, m);
        System.out.println(ans);
    }
}
