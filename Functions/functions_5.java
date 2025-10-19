import java.util.*;

public class functions_5{
    public static double circumferenceOfCircle(int r){
        double circumference = 2*3.14*r;
        return circumference;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int r = sc.nextInt();
    double circumference = circumferenceOfCircle(r);
    System.out.println("Circumference of the circle "+ circumference);
    }
}