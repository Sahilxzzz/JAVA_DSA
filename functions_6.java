import java.util.Scanner;

public class functions_6 {

    // Function to check voting eligibility and return the result as a String
    public static String checkAge(int age) {
        int minAge = 18;

        if (age >= minAge) {
            return "You are eligible to vote";
        } else {
            return "You are not eligible to vote";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // Taking age as input

        String result = checkAge(x); // Call function and store result
        System.out.println(result);  // Print the returned result
    }
}
