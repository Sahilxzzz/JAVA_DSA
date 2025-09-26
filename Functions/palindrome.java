package Functions;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        boolean isPalindrome = palindrome(n);
        System.out.println("Is the number a palindrome? " + isPalindrome);

    }
   static boolean palindrome (int n){
        int temp = n;
        int palindrome = 0;
        while (n > 0) {
            int digit = n % 10;
            palindrome =  palindrome* 10 + digit;
            n = n / 10;
        }
        return palindrome == temp;
    }
}
