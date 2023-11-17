import java.util.Scanner;
import java.lang.Math;
public class BMICalc{
    public static void main ( String[] args){
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Your height in m: ");
      double height = keyboard.nextDouble();

      System.out.print("Your weight in kg: ");
      double weight = keyboard.nextDouble();

      double result = weight / (Math.pow(height,2));

      System.out.print("Your BMI is "+ result);

    }
}
// how to change eyboard langugae in google search windows
