public class pattern_13 {
    public static void main(String[]agrgs){
        int n = 5;

        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //1st part 
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2nd part
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    } 
}
