package hashing;

import java.util.*;

public class counting_elements_array {

    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        System.out.println("Enter array size: ");
        int n;
        n = sc.nextInt();
        System.out.println("Array:");
        int [] arr = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        //precomputing
        
        int [] hash = new int [13];
        for(int i= 0;i<n;i++){
            hash[arr[i]] += 1;
        }

        //fetching
        System.out.println("Enter the no of Queries: ");
        int q;
        q = sc.nextInt();
        int number;
        while(q != 0){
            number = sc.nextInt();
            System.out.println(hash[number]);
            q--;
        }
        
    }
}