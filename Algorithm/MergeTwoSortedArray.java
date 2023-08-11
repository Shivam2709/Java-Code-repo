// Time Complexity is O(n log n).
// Space Complexity is O(n).

package Algorithm;

public class MergeTwoSortedArray {
    public static void merge( int arr1[], int arr2[],int n1, int n2,int arr3[]) {
        int i =0; int j=0; int k=0;
        while(i<n1 && j< n2 ){

            if(arr1[i] < arr2[j]){
                arr3[k++]= arr1[i++];
            }else {
                arr3[k++] = arr2[j++];
            }

        }
        while(i<n1){
            arr3[k++] = arr1[i++];
        }
        while(j<n2){
            arr3[k++] = arr2[j++];
        }

    }
    public static void main(String[] args) {
        int arr1[] = {3,5,9};
        int n1= arr1.length;
        int arr2[] = {2,4,8,10};
        int n2 = arr2.length;
        int[] arr3 = new int [n1+n2];
        merge(arr1, arr2,n1, n2, arr3);
        for(int i =0; i< n1+n2; i++){
            System.out.print(arr3[i]+" ");
        }


    }
}
