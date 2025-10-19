import java.util.*;

public class function_3 {
    
    // Function to calculate sum of odd numbers from 1 to n
    public static int sumOfOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = sumOfOdds(n);
        System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + result);
    }
}
