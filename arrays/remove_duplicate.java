package arrays;

public class remove_duplicate {
    static int remove_duplicates(int [] arr){
        int i = 0;
        for(int j =1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
            arr[i+1] = arr[j];
            i++;
            }
        }
        return (i+1);
    }

    public static void main(String[] args) {
    int [] arr = {1,1,2,2,2,3,3};
    remove_duplicates(arr);
    }
}
