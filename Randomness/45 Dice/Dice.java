import java.util.Random;

public class Dice{
    public static void main ( String[] args)
    {
        Random ran = new Random();
        int num1 = 1 + ran.nextInt(6);
        int num2 = 1 + ran.nextInt(6);
        int total = num1 + num2;

        System.out.println("here come dice");
        System.out.println();
        System.out.println("Roll #1:" + num1);
        System.out.println("Roll #2:" + num2);
        System.out.println("The total is " + total +"!");


    }
}