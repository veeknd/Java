import java.util.Scanner;

public class SpaceBoxing
{
    public static void main ( String[] args)
    {
        int weight;
        int choice;
        double multiplicant = 0;
        double result;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your current earth weight: ");
        weight = keyboard.nextInt();
        System.out.println("I have information for the following planets:");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune");

        System.out.print("Which planet are you visiting? ");
        choice = keyboard.nextInt();

        if (choice == 1)
        {
            multiplicant = .78;
        }
        else if (choice == 2)
        {
            multiplicant = .39;
        }
        else if (choice == 3)
        {
            multiplicant = 2.65;
        }
        else if (choice == 4)
        {
            multiplicant = 1.17;
        }
        else if (choice == 5)
        {
            multiplicant = 1.05;
        }
        else if (choice == 6)
        {
            multiplicant = 1.23;
        }

        result = weight * multiplicant;
        System.out.print("Your weight would be " + result + " pounds on that planet");

    }
    
}