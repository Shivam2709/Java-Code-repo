import java.util.Arrays;
public class KeyPair {
    static String isSum(int array[], int x, int n) {
        Arrays.sort(array);
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == x)
                return "yes";
            else if (array[i] + array[j] > x)
                j--;
            else
                i++;
        }
        return "No";
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 45, 6, 10, 8};
        int n = arr.length;
        int x = 16;

        System.out.println(isSum(arr, x, n));

    }
}

