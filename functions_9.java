import java.util.Scanner;

public class functions_9 {
    public static int findGCD(int a , int b) {
        int gcd =1;
        int min = Math.min(a,b);

        for (int i=1; i<= min; i++){
            if (a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = findGCD(a, b);
        System.out.println("GCD value: " + result);
    }
}
