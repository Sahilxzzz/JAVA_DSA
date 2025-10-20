package hashing;

import java.util.HashMap;

public class highest_lowest_hashmaps {
    public static void main(String[] args) {
        int arr [] = {10,5,10,15,10,5};
        int n = arr.length;
        freq(arr,n);
    }
    static void freq(int [] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count>maxFreq){
                maxEle = element;
                maxFreq = count;
            }
            if(count<minFreq){
                minEle = element;
                minFreq = count;
            }
        }
        System.out.println("The highest freq element: "+maxEle);
        System.out.println("The lowest freq element: "+minEle);

    }
}
