package arrays;

public class find_max {
   public class Main {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 7, 18, 1};
        System.out.println("Maximum value is " + findMax(numbers));
    }
}

}
