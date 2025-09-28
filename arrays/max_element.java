package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] arr = new int[5];
        System.out.println("Enter the elements of array");
        for(int i = 0; i<5; i++){ 
            arr[i] = sc.nextInt();
        }

    System.out.println(max(arr,1,4));
    }

    static int max(int[]arr, int start, int end){
        int max = arr[start];
        for(int i = 1; i < end; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
