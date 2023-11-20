import java.util.Scanner;

public class RightTriangleChecker
{
    public static void main ( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        System.out.println("Enter three integers:");
        System.out.print("Side1: ");
        side1 = keyboard.nextInt();
        do
        {
            System.out.print("\nSide2: ");
            side2 = keyboard.nextInt();
            if (side2 < side1)
            {
                System.out.print(" \n"+ side2 + " is smaller than " + side1);
            }
        }while (side2 < side1);

        do
        {
            System.out.print("\nSide3: ");
            side3 = keyboard.nextInt();
            if (side3 < side2)
            {
                System.out.print(" \n"+ side3 + " is smaller than " + side2);
            } 
        }while(side3 < side2);

        System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3 + " ");
        
        if (Math.pow(side3,2) == (Math.pow(side1,2) + Math.pow(side2,2)))
        {
            System.out.print("These sides *do* make a right triangle.  Yippy-skippy!");
        }
        else
        {
             System.out.print("NO!  These sides do not make a right triangle!");
        }

       

        
    }
}