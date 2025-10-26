package arrays;
import java.util.*;;
public class intersection_array {   
    static ArrayList <Integer> FindIntersection(int[]A, int[]B, int n , int m){
        int i =0 , j=0;
        ArrayList <Integer> Intersection = new ArrayList<>();
        while(i<n && j<m){
            if(A[i]<B[j]){
                i++;
            }
            else if (B[j]<A[i])
            j++;
            else {
                Intersection.add(A[i]);
                i++;
                j++;
            }
        } return Intersection ;
    }

    public static void main(String[] args) {
        int n = 8, m = 7;
        int[]A = {1,2,2,3,3,4,5,6};
        int[]B = {2,3,3,5,6,6,7};

        ArrayList <Integer> Intersection = FindIntersection(A,B,n,m);
        for(int val : Intersection)
        System.out.print(val+" ");
    }
}
