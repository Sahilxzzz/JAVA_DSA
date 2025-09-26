package Functions;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    
    }
    static int factorial( int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            
        }
        return fact;
    }
}
