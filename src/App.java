import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;
        while(true) {
            System.out.println("Pls enter your move (r, p or s)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
            System.out.println(playerMove + "is not a valid move");
        }

        System.out.println("Computer player" + computerMove);
        if (playerMove.equals(computerMove)) {
            System.out.println("The game was a tie");
        } else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("s")) {
                System.out.println("You win!");
            }
        } else if (playerMove.equals("p")) {
            if (computerMove.equals("s")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("r")) {
                System.out.println("You win!");
            }
        } else if (playerMove.equals("s")) {
            if (computerMove.equals("r")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("p")) {
                System.out.println("You win!");
            }
        }

    }
}
