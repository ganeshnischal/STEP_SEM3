package main.Strings.Class__Problems;
import java.util.Scanner;
class RockPaper{
    String playRound(String playerMove, String computerMove){
        if (playerMove.equals(computerMove)){
            return "Draw";
        }
        else if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||(playerMove.equals("Paper") && computerMove.equals("Rock")) ||(playerMove.equals("Scissors") && computerMove.equals("Paper"))){
            return "Player Wins";
        }
        else{
            return "Computer Wins";
        }
    }
    void playGame(){
        Scanner sc = new Scanner(System.in);
        String[] computerMoves ={"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] playerMoves = new String[5];
        String[] results = new String[5];
        int wins = 0;
        int losses = 0;
        int draws = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = sc.next();
            String computerMove = computerMoves[i];
            String result = playRound(playerMove, computerMove);
            playerMoves[i] = playerMove;
            results[i] = result;
            if (result.equals("Player Wins")){
                wins++;
            }
            else if (result.equals("Computer Wins")){
                losses++;
            }
            else{
                draws++;
            }
        }
        System.out.println();
        System.out.println("Round\tPlayer Move\tComputer Move\tResult");
        for (int i = 0; i < 5; i++){
            System.out.println((i + 1) + "\t" +playerMoves[i] + "\t\t" +computerMoves[i] + "\t\t" +results[i]);
        }
        double winPercentage = (wins / 5.0) * 100;
        System.out.println();
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");
    }
    public static void main(String[] args){
        RockPaper obj = new RockPaper();
        obj.playGame();
    }
}
