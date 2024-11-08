// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Rock, paper, scissors?");
//         String myChoice = scanner.nextLine();

//         // if(!myChoice.equals("Rock") && !myChoice.equals("Paper") && !myChoice.equals("Scissors")){
//         //     System.err.println("Invalid choice: please choose Rock, Paper or Scissors");
            
//         // } 

//         int opponentNum = (int) (Math.random() *3);
//         String opponentChoice;

//         if(opponentNum == 0){
//             opponentChoice = "Rock";
//         } else if(opponentNum == 1){
//             opponentChoice = "Paper";
//         } else if (opponentNum == 2){
//             opponentChoice = "Scissors";
//         }

//         if (myChoice.equals("Rock")){
//             if (opponentChoice.equals("Rock")){
//                 System.out.println("It's a tie");
//             } else if(opponentChoice.equals("Paper")){
//                 System.out.println("Opponent wins");
//             } else {
//                 System.out.println("You win");
//             }
//         } else if (myChoice.equals("Paper")){
//             if (opponentChoice.equals("Paper")){
//                 System.out.println("It's a tie");
//             } else if(opponentChoice.equals("Scissors")){
//                 System.out.println("Opponent wins");
//             } else {
//                 System.out.println("You win");
//             }
//         } else if (myChoice.equals("Scissors")){
//             if (opponentChoice.equals("Scissors")){
//                 System.out.println("It's a tie");
//             } else if(opponentChoice.equals("Rock")){
//                 System.out.println("Opponent wins");
//             } else {
//                System.out.println("You win");
//             }
//         }

//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock, paper, scissors?");
        String myChoice = scanner.nextLine().trim().toLowerCase(); 

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
            } else {
                System.out.println("You win");
            }
        } else if (myChoice.equals("paper")) {
            if (opponentChoice.equals("paper")) {
                System.out.println("It's a tie");
            } else if (opponentChoice.equals("scissors")) {
                System.out.println("Opponent wins");
            } else {
                System.out.println("You win");
            }
        } else if (myChoice.equals("scissors")) {
            if (opponentChoice.equals("scissors")) {
                System.out.println("It's a tie");
            } else if (opponentChoice.equals("rock")) {
                System.out.println("Opponent wins");
            } else {
                System.out.println("You win");
            }
        } else {
            System.err.println("Invalid input! Please choose rock, paper, or scissors.");
        }
    }
}