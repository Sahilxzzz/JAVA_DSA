package hashing;

import java.util.*;

public class occurance_element_hashmaps { 
public static void main(String args[]){  
   
   int arr[] = {10,5,10,15,10,5};
     int n = arr.length;
     Frequency(arr, n);
  }
static void Frequency(int arr[], int n)
{
    HashMap<Integer, Integer> map = new HashMap<>();
 
    for (int i = 0; i < n; i++)
    {
        int key = arr[i];
        int freq = 0;
        if(map.containsKey(key))
        freq = map.get(key);
        freq++;
        map.put(key, freq);
    }
    // Traverse through map and print frequencies
    for (HashMap.Entry<Integer,Integer> entry : map.entrySet())
    {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
}
