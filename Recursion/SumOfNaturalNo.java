public class SumOfNaturalNo {

    public static int Sum(int n){
        if( n == 1){
            return 1;
        }
        return Sum(n-1) + n;
    }

    public static void main(String[] args) {

        int n= 4;
        System.out.println(Sum(n));
    }
}
