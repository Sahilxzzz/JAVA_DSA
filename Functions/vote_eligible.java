package Functions;

import java.util.Scanner;
public class vote_eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();

        boolean isEligible = isEligible(age);
        //int vote_eligible = voteEligible(age);
    }

    static boolean isEligible(int age){
        if(age>=18){
            System.out.println("You are eligible to vote");
            return true;
        }
        else{
            System.out.println("You are not eligible to vote");
            return false;
        } 
    }
   /*  static int voteEligible(int age){
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        return age; 
    } */
   
}
