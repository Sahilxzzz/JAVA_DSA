package arrays;
import java.util.*;
public class move_zeros_to_end {
    static void movezeros(int[]arr,int n){
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        if(j == -1)return;
        for(int i = j+1; i<n;i++){
            if(arr[i]!=0){
            int temp = arr[i];  
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            }
        }
        return;
    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,2,0,4,5,1};
        int n = arr.length;

        movezeros(arr,n);
        
        System.out.println(Arrays.toString(arr));
    }
}
