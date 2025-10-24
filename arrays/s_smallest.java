package arrays;
import java.util.*;

public class s_smallest {
    static int ssmallest(int []arr,int n){
        int smallest = arr[0], ssmallest = Integer.MAX_VALUE;
    
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int second_smallest = ssmallest(arr,n);
        System.out.println(second_smallest);
    }
}
