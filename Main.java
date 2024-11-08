import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ROCK, PAPER, SCISSORS.  BEST OF 3");
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int opponentScore = 0;
        while(true){
            System.out.println("Rock, paper, scissors? Enter Quit to quit the game.");
            String myChoice = scanner.nextLine().trim().toLowerCase();
            System.out.println("Opponent choose: Rock, Paper, Scissors? (Quit will exit game)");
            String opponentChoice = scanner.nextLine().trim().toLowerCase();

            if(myChoice.equals("quit")|| opponentChoice.equals("quit")){
                break;
            } 
            System.out.println("You chose: " + myChoice);
            System.out.println("Opponent chose: " + opponentChoice);
        

            if (myChoice.equals("rock")) {
                if (opponentChoice.equals("rock")) {
                    System.out.println("It's a tie");
                } else if (opponentChoice.equals("paper")) {
                    System.out.println("Opponent wins");
                    opponentScore++;
                } else {
                    System.out.println("You win");
                    playerScore++;
                }
                System.out.println("Player: " + playerScore + " Opponent: " + opponentScore);
            } else if (myChoice.equals("paper")) {
                if (opponentChoice.equals("paper")) {
                    System.out.println("It's a tie");
                } else if (opponentChoice.equals("scissors")) {
                    System.out.println("Opponent wins");
                    opponentScore++;
                } else {
                    System.out.println("You win");
                    playerScore++;
                }
                System.out.println("Player: " + playerScore + " Opponent: " + opponentScore);
            } else if (myChoice.equals("scissors")) {
                if (opponentChoice.equals("scissors")) {
                    System.out.println("It's a tie");
                } else if (opponentChoice.equals("rock")) {
                    System.out.println("Opponent wins");
                    opponentScore++;
                } else {
                    System.out.println("You win");
                    playerScore++;
                }
                System.out.println("Player: " + playerScore + " Opponent: " + opponentScore);
            } else {
                System.err.println("Invalid input! Please choose rock, paper, or scissors.");
            }

            if(playerScore + opponentScore == 3){
                break;
            }
        }
        System.out.println("Thank you for playing!");
        if(playerScore>opponentScore){
            System.out.println("You win!");
        } else if(opponentScore>playerScore){
            System.out.println("Opponent wins!");
        }
    }
}