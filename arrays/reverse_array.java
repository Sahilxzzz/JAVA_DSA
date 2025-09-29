package arrays;

import java.util.Scanner;
import java.util.Arrays;
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] arr = new int[5];
        System.out.println("Enter the elements of array");

        for(int i = 0; i<5; i++){ 
            arr[i] = sc.nextInt();
        }
        
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }   
    static void reverse(int[]arr){ // two pointer approach
        int start = 0;             //suppose arr is 1 2 3 4 5 the start is 0 and end is 4 (as size is 5 and length-1 is 4)
        int end = arr.length - 1;  

        while(start<end){ //0<4 1<3 2<2 (when start=2 and end=2 the loop will break)
            swap(arr, start, end); // this will run 1st
            start++;
            end--;
        }
    
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
