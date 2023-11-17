import java.util.Scanner;

public class AgeMessages3
{
    public static void main (String[] args)
    {
        String name;
        int age =-1;
        String message = "none";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("You name: ");
        name = keyboard.next();

        System.out.print("Your age: ");
        age = keyboard.nextInt();

        if (age < 16)
        {
            message = " You can't drive, ";
        }

        if (age >= 16 && age < 18)
        {
            message = "you can drive but not vote, ";
        }

        if (age >=18 && age < 24)
        {
            message = "You can vote but not rent, ";
        }
        if (age > 24)
        {
            message="you can do pretty much anything, ";
        }

        System.out.print(message + name);
    }
}