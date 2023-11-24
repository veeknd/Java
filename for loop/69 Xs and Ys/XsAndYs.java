import java.util.Scanner;

public class XsAndYs
{
    public static void main (String[] args)
    {
        System.out.println("X  |  Y");
        for (double n = -10; n<=10;n+=0.5)
        {
            System.out.println(n + " | " + Math.pow(n,2));
        }
    }
}