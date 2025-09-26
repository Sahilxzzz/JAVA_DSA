package Functions;
import java.util.Scanner;
public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isPythagoreanTriplet = pythagoreanTriplet(a, b, c);
        System.out.println("Is Pythagorean Triplet? " + isPythagoreanTriplet);
    }

    static boolean pythagoreanTriplet(int a, int b, int c){
        return (a*a + b*b == c*c) || (b*b + c*c == a*a) || (a*a + c*c == b*b);

    }

}
