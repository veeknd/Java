import java.util.Scanner;

public class TwentyQuestions
{
    public static void main (String [] args)
    {
        String type;
        String biggerThanBreadbox;
        String guess = "nil";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        type = keyboard.next();

        System.out.println("Question 2) Is it bigger than a breadbox?");
        biggerThanBreadbox = keyboard.next();

        if (type.equals("animal"))
        {
            if (biggerThanBreadbox.equals("yes"))
            {
                guess = "moose";
                System.out.print("activated");
            }
            else
            {
                guess= "squirell";
            }
        }

        else if (type.equals("vegetable"))
        {
            if (biggerThanBreadbox.equals("yes"))
            {
                guess = "watermelon";
            }
            else{
                guess = "carrot";
            }
        }
        else if (type.equals("mineral"))
        {
            if (biggerThanBreadbox.equals("yes"))
            {
                guess = "Camero";
            }
            else{
                guess = "paper clip";
            }
        }

        System.out.println("My guess is that you are thinking of a " + guess);
        System.out.println("I would ask you if I'm right, but I don't actually care.");
    }
}