import java.util.Scanner;

public class functions_8 {
    public static int power (int x , int n ){
        int result = 1;

        for (int i=1; i<=n; i++){
            result = result*x;
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a base (X): ");
        int x = sc.nextInt();

        System.out.println("Enter a power (N): ");
        int n = sc.nextInt();

        int ans = power(x,n);
        System.out.println("so x^n is: "+ ans);
    }
}
