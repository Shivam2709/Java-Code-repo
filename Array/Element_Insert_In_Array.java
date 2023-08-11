package Array;

import java.util.Scanner;

public class Element_Insert_In_Array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr [] = new int [n+1];
    for(int i =0; i<n; i++){
         arr[i] = sc.nextInt();
    }
        System.out.println("Enter the element you want to insert");
    int z = sc.nextInt();
    int pos = sc.nextInt();

    for(int i =n;i>= pos; i--)
    {
        arr[i] = arr[i-1];
    }
    arr[pos-1] = z;

    for(int i =0;i<= n;i++){
        System.out.print(arr[i]+" ");
    }

}
}
