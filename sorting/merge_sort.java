package sorting;

import java.util.*;
public class merge_sort {

    static void mS(int[]arr,int low,int high){
        if(low>=high)
        return;
        int mid = (low+high)/2;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int low,mid,high;
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        mS(arr,low,high);
    }
}
