package Functions;
import java.util.Scanner;
public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); 

        int primeNo = primeNo(n);
      
    }

    static int primeNo(int n){
        if (n<=1){
            System.out.println("The number is not prime");
            return n;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                System.out.println("The number is not prime");
                return n;
            }
            c++;

        }
        if (c*c > n){
            System.out.println("The number is prime");
            
        } 
        return n;
    }
}
