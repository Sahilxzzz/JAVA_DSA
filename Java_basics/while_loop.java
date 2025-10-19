import java.util.Scanner;

public class while_loop {
    public static void main ( String [] args){
        Scanner scanner = new Scanner (System.in);
        String name = "";

        do {
            System.out.print("Enter the name "+name);
            name = scanner.nextLine();
        }while (name.isBlank());
        System.out.println("Hello "+name);;
    }
}


