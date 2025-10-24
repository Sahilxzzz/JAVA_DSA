package arrays;
import java.util.*;

public class slargest {
    static int slargest(int []arr,int n){
        int largest = arr[0], slargest = -1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int second_largest = slargest(arr,n);
        System.out.println(second_largest);
    }
}
