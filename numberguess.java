import java.util.*;
public class numberguess {
    public static void main(String args[]){
        Random r = new Random();
        int randomInt = r.nextInt(101);
        Scanner scan = new Scanner(System.in);
        int guesses = 1;
        while(guesses <= 5){
            System.out.println("Guess the number from 1-100 (int): ");
            int guess = scan.nextInt();
            if(guess <= randomInt+10 && guess >= randomInt-10){
                System.out.println("You're guess was within the acceptable range!");
                System.out.println("The number was "+ randomInt + "+-10");
                break;
            }
            System.out.println("You're guess is not within the acceptable range.");
            guesses++;
        }
        if(guesses > 5){
            System.out.println("Sorry. The answer was "+ randomInt + "+-10");
        }
    }
}
