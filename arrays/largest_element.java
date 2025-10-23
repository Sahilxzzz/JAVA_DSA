package arrays;

import java.util.Scanner;
import java.util.*;

public class largest_element {
    static int largest(int[]arr,int n){
        int largest = arr[0];
        for(int i = 0; i<n;i++){
            if(arr[i]>largest)
            largest = arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int largest = largest(arr,n);
        System.out.println(largest);
    }
}
