package recursion;

import java.util.*;

public class reverse_method2 {

    static void f(int i,int []arr){
        int n = 5;
        if(i>=n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        f(i+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        f(0,arr);
        System.out.println((Arrays.toString(arr)));
    }
}
