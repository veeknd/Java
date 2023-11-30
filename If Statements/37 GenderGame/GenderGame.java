import java.util.Scanner;

public class GenderGame{
     public static void main(String[] args)
    {
        String gender = "F";
        String first_name;
        String last_name;
        int age;
        String married = "y";
        String tag;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        gender = keyboard.next();
 

        System.out.print("Are you married: ");
        married = keyboard.next();

        if ("F".compareTo(gender) == 0)
        {
            if ("y".compareTo(married) == 0)
            {
            tag = "Mrs"
            }
            else if ("n".compareTo(married) == 0)
            {
                tag = "Ms"
            }

            
        }
        else{
            tag = "Mr"
        }



    }
}