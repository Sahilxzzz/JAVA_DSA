package basic_maths;


public class extraction_digit {
    public static void main(String[] args) {
        int n = 554487;
        System.out.println("The digits are: ");
        while(n>0){
            int d = n%10;
            n = n/10;
            System.out.print(d);
        }
    }
}
