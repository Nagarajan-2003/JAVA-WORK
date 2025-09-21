import java.util.Scanner;
import java.util.Random;
public class number_guessing_game{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int guess;
        int attempts=0;
        int min =1;
        int max=100;
        int randomnumber=random.nextInt(min,max+1);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");
        do{
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            attempts++;
            if(guess<randomnumber){
                System.out.println("Too low! Try again.");
            }else if(guess>randomnumber){
                System.out.println("Too high! Try again.");
            }else{
                System.out.println("Congratulations! You've guessed the number " +randomnumber + " in " +attempts + " attempts.");
            }
        }while(guess!=randomnumber);
        sc.close();
    }
}