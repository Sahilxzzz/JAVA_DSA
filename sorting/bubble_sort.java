package sorting;

import java.util.*;
public class bubble_sort {

    static void bubble_sort(int[]arr,int n){
        for(int i = n-1; i >= 0;i--){
            int didSwap = 0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            
            }
            if(didSwap==0){
                break;
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
        bubble_sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}