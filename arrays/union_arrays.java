package arrays;

import java.util.*;

public class union_arrays {
    static ArrayList<Integer> FindUnion(int[]arr1,int[]arr2,int n,int m ){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++)
        s.add(arr1[i]);
        for(int i=0;i<m;i++)
        s.add(arr2[i]);

        ArrayList<Integer> Union = new ArrayList<>();
        for(int it : s){
            Union.add(it);
        }
        return Union;
    }

    public static void main (String[]args){
        int n =10,m=7;
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = {2,3,4,4,5,11,12};

        ArrayList<Integer> Union = FindUnion(arr1,arr2,n,m);
        for(int val : Union){
            System.out.print(val + " ");
        }
    }
}