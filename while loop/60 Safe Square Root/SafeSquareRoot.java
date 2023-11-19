import java.util.Scanner;

public class SafeSquareRoot
{
    public static void main ( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("SQUARE ROOT!");
        System.out.println("Enter a number");
        int guess=keyboard.nextInt();
        double sqrt;
        while (guess < 0)
        {
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.print("Try again: ");
            guess = keyboard.nextInt();

        }

        sqrt = Math.sqrt(guess);
        System.out.print("The square root of "+ guess + " is " + sqrt);
    }
}