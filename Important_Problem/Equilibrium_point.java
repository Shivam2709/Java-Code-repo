package Important_Problem;
public class Equilibrium_point {

    public static int equilibrium(int arr[]) {

         int n = arr.length;
         int sum =0,Ls =0, Rs =0;

    // Fiest we add all the element of array.
         for(int i= 0; i<n;i++){
             sum = sum + arr[i];
         }

    // we assign Rs is equal to sum.
        Rs = sum;
         for(int i =0; i<n;i++){
             Rs = Rs - arr[i];

             if(Rs == Ls){
                 System.out.println(arr[i]);
             }else{
                 Ls = Ls + arr[i];
             }
         }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 4, 5};
        equilibrium(arr);

    }
}
