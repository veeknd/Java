import java.util.Scanner;
import java.util.Random;

public class KeepGuessing
{
    public static void main( String[] args)
    {
        Random ranInt = new Random();
        int num = 1 + ranInt.nextInt(10);

        Scanner keyboard = new Scanner(System.in);

        System.out.print("your guess: ");
        int guess = keyboard.nextInt();

        while (guess != num)
        {
            System.out.println("Thisis incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
        }   
        System.out.println("Thats right");
    }   
     

}