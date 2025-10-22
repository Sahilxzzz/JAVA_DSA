package sorting;

import java.util.*;
public class merge_sort {
    static void mS(int[]arr,int low, int mid, int high,int n){
      ArrayList<Integer> temp = new ArrayList<>();
    int left = low, right = mid + 1;

    while (left <= mid && right <= high) {
        if (arr[left] <= arr[right]) {
            temp.add(arr[left]);
            left++;
        } else {
            temp.add(arr[right]);
            right++;
        }
    }
    while (left <= mid) {
        temp.add(arr[left]);
        left++;
    }
    while (right <= high) {
        temp.add(arr[right]);
        right++;
    }

    // Copy back
    for (int i = 0; i < temp.size(); i++) {
        arr[low + i] = temp.get(i);
    }

 }



    static void mS(int[]arr,int low,int high, int n){
        if(low>=high)
        return;
        int mid = (low+high)/2;
        int right = mid+1;
        mS(arr,low,mid,n);
        mS(arr,right,high,n);
        mS(arr,low, mid, high,n);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        mS(arr, 0, n-1,n);
        System.out.println(Arrays.toString(arr));
    }
}
