package pig;
/**
 *
 * @author Jack Eller
 * git addon test
 * this should add to the main branch
 */
import java.util.Scanner;
public class game extends pigDice{
    public static void main(String[]args){
        String opponent;
        System.out.println("Hello player! What is your name?");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Ok "+name+", let me get the dice set up...");
        System.out.println("The name of the game is pig, would you like to play? (y/n)");
        String play = new Scanner(System.in).nextLine();
        System.out.println("Do you want to play against an AI, another player, or Caleb? (a/p/c)");
        String p2 = new Scanner(System.in).nextLine();
        if(p2.equalsIgnoreCase("a")){
            System.out.println("A.I created...");
            opponent="A.I";
        }else if(p2.equalsIgnoreCase("p")){
            System.out.println("Welcome Player 2, what is your name?");
            opponent = new Scanner(System.in).nextLine();
            System.out.println("Hello "+opponent+",  let's begin...");
        }else if(p2.equalsIgnoreCase("c")){
            System.out.println("Launching A.I: Caleb");
            opponent="Caleb";
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
            System.out.println("play value is: "+playValue + " AI_fs is: "+ AI_finalScore + " and final score is: " + finalScore);
        while(turn==1){
        System.out.println("Roll? (y/n)");
        String roll = new Scanner(System.in).nextLine();
        if (roll.equalsIgnoreCase("n")){
            rollValue="n";
            finalScore=currentScore+finalScore;
            System.out.println("Final Score: "+finalScore); // final score? or current score?
            turn=2;
        }
        rollValue=roll;
        while(rollValue.equalsIgnoreCase("y")&&turn==1){
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
        }
        if(turn==1){
        currentScore = currentScore+roll1+roll2;
        System.out.println("Current Score is: "+currentScore);
        }
        rollValue="n";
        roll1 = 0;
        roll2 = 0;
    }
        }
       while(turn==2){
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
           } 
           currentScore = currentScore+roll1+roll2;
           System.out.println("Current Score is: "+currentScore);
       }
    }
    }
    
    }