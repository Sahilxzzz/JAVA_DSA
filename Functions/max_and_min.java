package Functions;
import java.util.Scanner;

public class max_and_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = max(a,b,c);
        System.out.println("The maximum value is " + max);
        int min = min(a,b,c);
        System.out.println("The minimum value is " + min);
    }

    static int max (int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }

    static int min (int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
