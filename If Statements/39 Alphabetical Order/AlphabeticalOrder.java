import java.util.Scanner;

public class AlphabeticalOrder{
    public static void main ( String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int tokenValue;
        String message;
        System.out.print("What is your last name?");
        name = keyboard.next();
        tokenValue = name.compareTo("A");
        if (tokenValue < 3)
        {
            message = "you don't have to wait long, ";
        }
        else if (tokenValue >= 3 && tokenValue <= 9)
        {
            message="that's not bad, ";
        }
        else if (tokenValue >= 10 && tokenValue <= 19)
        {
            message="looks like a bit of a wait, ";
        }
        else if (tokenValue >= 20 && tokenValue <= 25)
        {
            message="it's gonna be a while, ";
        }
        else
        {
            message="not going anywhere for a while?, ";
        }

        System.out.println(message + name);

    }
}