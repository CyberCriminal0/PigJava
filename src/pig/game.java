package pig;
/**
 * @author Jack Eller
 * git addon test main 
 */
import java.util.Scanner;
public class game extends pigDice{
    public static void main(String[]args){
        String opponent;
        int player2 = 0;
        System.out.println("Hello player! What is your name?");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Ok "+name+", let me get the dice set up...");
        System.out.println("The name of the game is pig, would you like to play? (y/n)");
        String play = new Scanner(System.in).nextLine();
        System.out.println("Do you want to play against an AI, another player, or Caleb? (a/p/c)");
        String p2 = new Scanner(System.in).nextLine();
        if(p2.equalsIgnoreCase("a")){
            System.out.println("AI created...");
            opponent="A.I";
            player2=1;
        }else if(p2.equalsIgnoreCase("p")){
            System.out.println("Welcome Player 2, what is your name?");
            opponent = new Scanner(System.in).nextLine();
            System.out.println("Hello "+opponent+",  let's begin...");
            player2=2;
        }else if(p2.equalsIgnoreCase("c")){
            System.out.println("Launching AI: Caleb");
            opponent="Caleb";
            player2=3;
        }
        String playValue;
        String rollValue;
        int currentScore=0;
        int roll1 = 0;
        int roll2 = 0;
        int turn=1;
        int finalScore=0;
        int AI_finalScore=0;
        pigDice d1 = new pigDice();
        pigDice d2 = new pigDice();
        System.out.println("Creating dice...");
        playValue=play;
        while(playValue.equalsIgnoreCase("y")&&AI_finalScore<100&&finalScore<100){
        //System.out.println("play value is: "+playValue + " player 2 score is: "+ AI_finalScore + " and player 1 score is: " + finalScore);
        while(turn==1){
        System.out.println("Roll? (y/n)");
        String roll = new Scanner(System.in).nextLine();
        if (roll.equalsIgnoreCase("n")){
            rollValue="n";
            finalScore=currentScore+finalScore;
            System.out.println("Final Score: "+finalScore); // final score? or current score?
            turn=2;
            currentScore=0;
        }
        rollValue=roll;
        while(rollValue.equalsIgnoreCase("y")&&turn==1){
        roll1=0;
        roll2=0;
        d1.roll(1);
        d2.roll(1);
        roll1 = d1.score();
        roll2 = d2.score();
            System.out.println("d1 score: "+roll1);
            System.out.println("d2 score: "+roll2);
        System.out.println("about to check for ones...");
        if(roll1==0||roll2==0&&turn==1){
            System.out.println("rolled a one -- turn over. \r\n setting turn to 2");
            turn=2;
            roll1=0;
            roll2=0;
            currentScore=0;
        }
        if(turn==1){
        currentScore += roll1+roll2;
        System.out.println("Current Score is: "+currentScore);
        }
        rollValue="n";
        roll1 = 0;
        roll2 = 0;

    }
        }
       while(turn==2){
           int rollmax=0;
           if(player2==1){
           System.out.println("Changing to AI's turn");
           rollmax=rollmax+((int)(Math.random()*50));
           while(rollmax>currentScore&&turn==2){
           roll1 = 0;
           roll2 = 0;
           d1.roll(1);
           d2.roll(1);
           roll1 = d1.score();
           roll2 = d2.score();
           System.out.println("about to check for ones...");
           if(roll1==0||roll2==0&&turn==2){
            System.out.println("rolled a one -- turn over.\r\n setting turn to 1");
            turn=1;
            roll1=0;
            roll2=0;
            currentScore=0;
           }else{
           currentScore += roll1+roll2;
           }
           }
           System.out.println("AI has ended their turn...");
           turn=1;
           currentScore=0;
           }else if(player2==2){
               System.out.println("Player 2's turn");
               System.out.println("Roll? (y/n)");
        String roll = new Scanner(System.in).nextLine();
        if (roll.equalsIgnoreCase("n")){
            rollValue="n";
            AI_finalScore=currentScore+AI_finalScore;
            System.out.println("Final Score: "+AI_finalScore); // final score? or current score?
            turn=2;
        }
        rollValue=roll;
        while(rollValue.equalsIgnoreCase("y")&&turn==2){
        roll1=0;
        roll2=0;
        d1.roll(1);
        d2.roll(1);
        roll1 = d1.score();
        roll2 = d2.score();
            System.out.println("d1 score: "+roll1);
            System.out.println("d2 score: "+roll2);
        System.out.println("about to check for ones...");
        if(roll1==0||roll2==0&&turn==1){
            System.out.println("rolled a one -- turn over. \r\n setting turn to 1");
            turn=1;
            roll1=0;
            roll2=0;
            currentScore=0;
        }
           }
           
           }
           } 
           currentScore = currentScore+roll1+roll2;
           System.out.println("Current Score is: "+currentScore);
       }
    }
}