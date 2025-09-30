package basic_maths;

import java.util.*;
public class gcd_hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 nos:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The two no.s are: "+a+" & "+b);

        int gcd = 0;
        

        for(int i=1; i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
            gcd = i;
                
            }
        }System.out.println("GCD is: "+gcd);
    }
}
