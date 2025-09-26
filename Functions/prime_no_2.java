package Functions;
import java.util.Scanner;
public class prime_no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int a = sc.nextInt();
        System.out.println("Enter the first no:");
        int b = sc.nextInt();
        

        int primeNo_between = primeno_between(a,b);
   //     System.out.println(a+ ""  + b);
    }

    static int primeNo(int a){
        int i ;
            if (a<=1){
                return a ;
            }
            for ( i=2; i*i<=a;i++){
                if(a%i==0)
                return a ;
            }
            if ( i*i > a){
                System.out.print(a+" ");
            }     
         return a;
    }

    static int primeno_between(int start, int end){
       int num;
        for ( num = start; num <= end; num++) {
            primeNo(num); // check and print if prime
        }
        return num ;
    }
}

