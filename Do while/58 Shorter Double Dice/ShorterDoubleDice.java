import java.util.Random;

public class ShorterDoubleDice
{
    public static void main (String[] args)
    {
        Random ranInt = new Random();
        int dice1;
        int dice2;
        int total;

        do{
            dice1 = 1 + ranInt.nextInt(6);
            dice2 = 1 + ranInt.nextInt(6);
            total = dice1 + dice2;
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("The total is  " + total);
            

        }while (dice1 != dice2);
    }
}