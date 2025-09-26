import java.util.Scanner;

public class functions_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int postCount = 0, zeroCount=0, negCount=0;

        String choice;
        do{
            System.out.println("Enter a no: ");
            int num = sc.nextInt();

            if(num>0){
                postCount++;
            }else if (num<0){
                negCount++;
            }else{
                zeroCount++;
            }

            System.out.println("Do you want to continue? (yes/no)");
            choice = sc.next();
        }
        while(choice.equalsIgnoreCase("Yes"));

        System.out.println("Positive no: "+postCount);
        System.out.println("Negative no: "+negCount);
        System.out.println("Zero no: "+zeroCount);
    }
}