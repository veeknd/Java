import java.util.Scanner;
public class LittleQuiz
{
    public static void main ( String[] args)
    {
        int count = 0;
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Are you ready for the quiz? ");
        keyboard.next();
        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println("	1) Melbourne");
        System.out.println("	2) Anchorage");
        System.out.println("	3) Juneau");

        choice = keyboard.nextInt();

        if (choice == 3)
        {
            count +=1;
            System.out.println("That's right!");
        }
        else
        {
            System.out.println("no, Juneau is the captial of alaska");
        }

        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("	1) yes");
        System.out.println("	2) no");

        choice = keyboard.nextInt();

        if (choice == 2)
        {
            count +=1;
            System.out.println("That's right!");
        }
        else 
        {
           System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.") ;
        }

        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("	1) 5");
        System.out.println("	2) 11");
        System.out.println("	3) 15/3");


        choice = keyboard.nextInt();

        if (choice == 2)
        {
            count +=1;
            System.out.println("That's right!");
        }
        else 
        {
           System.out.println("that's wrong, 9+6/6 is 11") ;
        }

        System.out.println("Overall, yoou got " + count + " out of 3 correct");
        System.out.println("Thanks for playing");




    }
}