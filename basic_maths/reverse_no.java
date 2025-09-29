package basic_maths;
import java.util.Scanner;
public class reverse_no {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int revNo = 0;

        while(n>0){
            int d= n%10;
            revNo = (revNo*10)+d;
            n = n/10;
        }
        System.out.println("The revNo is: "+revNo);
    }
}
