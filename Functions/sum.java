package Functions;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = product(a,b);
        System.out.println(product);

    }
    static int product(int a, int b){
        int product = a * b;
        return product;
    }
}
