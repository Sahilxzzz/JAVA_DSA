package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertion_sort {
    static void insertion_sort(int []arr,int n ){
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        insertion_sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
