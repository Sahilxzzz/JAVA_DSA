package arrays;

import java.util.Arrays;

public class rightrotate {
    static void reverse(int[]arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rightrotate(int[]arr,int n, int k){
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int arr [ ] = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;

        rightrotate(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
}
