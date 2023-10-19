import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        while(play.equals("yes")){
            int guess=-1;
            int tries=0;
            Random randNum  = new Random();
            int ComputerNumber = randNum.nextInt(100);
            while(guess!=ComputerNumber){
                System.out.println("Guess a number between 1 and 100");
                guess =sc.nextInt();
                tries++;
                if(guess==ComputerNumber){
                    System.out.println("Awesome! you guessed the numner right in just " +tries+ " guesses.The number is "+ ComputerNumber);
                    System.out.println("Did you like to play again?  (yes|no):");
                    play=sc.next().toLowerCase();
                }
                else if(guess < ComputerNumber){
                    System.out.println("Your guess is too low, try again.");
                }
                else{
                    System.out.println("your guess is too high, try again.");
                }
            }
        }
        sc.close();
    }
}