package Functions;

import java.util.Scanner;

public class even_odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int even_odd = evenOdd(n);
    }

    static int evenOdd(int n){
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        return n;
    }
}