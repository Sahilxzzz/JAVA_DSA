package recursion;
import java.util.*;

public class reverse_recursion {

    static void rev(int l, int r, int[] arr) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        rev(l+1, r-1, arr);
        
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        rev(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

    }
}
