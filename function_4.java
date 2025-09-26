import java.util.*;

public class function_4{
    public static int printGreaterNo (int a, int b){
        if (a >b){
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = printGreaterNo(a, b);

        System.out.println("The greater no is: " + result);
    }
}