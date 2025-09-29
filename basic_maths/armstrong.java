package basic_maths;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n_dup = n ;
        int sum = 0;

        while(n>0){
            int d = n%10;
            sum = sum + (d*d*d);
            n/=10;
        }
        if (sum == n_dup){
        System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an armstrong");
        }
    }
}
