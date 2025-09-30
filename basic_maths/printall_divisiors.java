package basic_maths;

import java.lang.Math;
import java.util.ArrayList;
import java.util.*;

public class printall_divisiors {
    public static void main(String[] args) {
        int n = 36;

        printAllDivisors(n);
    }

    static void printAllDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i*i<= n;i++){
            if (n%i == 0){
                list.add(i);
                if (n/i != i){
                    list.add(n/i);
                }
        }
        } 
        Collections.sort(list);
        System.out.println(list);
    }
}
