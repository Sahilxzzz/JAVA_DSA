package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class swap_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] arr = new int[5];
        System.out.println("Enter the elements of array");
        for(int i = 0; i<5; i++){ 
            arr[i] = sc.nextInt();
        }
         
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
