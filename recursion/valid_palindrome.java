package recursion;
import java.util.*;
public class valid_palindrome {

    static boolean f(int i,String []s){
        int n = s.length;   
        if(i >= n / 2) return true;
        if(s[i]!=(s[n - i - 1]))
            return false;
        return f(i + 1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = new String[5];
        for(int i=0;i<s.length;i++){
            s[i] = sc.next();
        }

        f(0,s);
        
    }
}
