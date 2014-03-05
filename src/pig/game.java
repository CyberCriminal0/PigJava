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
        System.out.println("The name of the game is pig, would you like to play? (y/n)");
        System.out.println("What is your name?");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Ok "+name+" let me get the dice set up...");
        String play = new Scanner(System.in).nextLine();
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
        if(roll1==0||roll2==0){
            System.out.println("rolled a one -- turn over. \r\n setting turn to 2");
            turn=1;
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
           if(roll1==0||roll2==0){
               System.out.println("rolled a one -- turn over.\r\n setting turn to 1");
            turn=2;
           } 
           currentScore = currentScore+roll1+roll2;
           System.out.println("Current Score is: "+currentScore);
       }
    }
    }
    
    }