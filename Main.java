import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int opponentScore = 0;
        while(true){
            System.out.println("Rock, paper, scissors? Enter Quit to quit the game.");
            String myChoice = scanner.nextLine().trim().toLowerCase();

            if(myChoice.equals("quit")){
                break;
            } 

            int opponentNum = (int) (Math.random() * 3); 
            String opponentChoice;

            if (opponentNum == 0) {
                opponentChoice = "rock";
            } else if (opponentNum == 1) {
                opponentChoice = "paper";
            } else {
                opponentChoice = "scissors";
            }

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
        }
        System.out.println("Thank you for playing!");
    }
}