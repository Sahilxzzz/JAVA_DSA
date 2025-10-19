import java.util.Scanner;

public class user_input {
    public static void main ( String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats ur name");
        String name = scanner.nextLine();

        System.out.println("How old u are");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What u need niga");
        String Money = scanner.nextLine();

        System.out.println("My name is "+name);
        System.out.println("Im" +age+ "years old... :)");
        System.out.println("I want to be "+Money);
    }
}
