import java.util.Scanner;

public abstract class logical_opr {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press Q or q to exit");
        String response = scanner.next();

        if(!response.equals ("q") && !response.equals("Q")){
            System.out.println("You are still playing");
        }
        else{
            System.out.println("Exited the game");
        }
    }
}
