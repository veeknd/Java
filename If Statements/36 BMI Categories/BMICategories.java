import java.util.Scanner;
import java.lang.Math;
public class BMICalc{
    public static void main ( String[] args){
      Scanner keyboard = new Scanner(System.in);
      String category = "none";

      System.out.print("Your height in m: ");
      double height = keyboard.nextDouble();

      System.out.print("Your weight in kg: ");
      double weight = keyboard.nextDouble();

      double result = weight / (Math.pow(height,2));

      System.out.println("Your BMI is "+ result);
      if (result < 18.5)
      {
        category = "underweight";
      }
      else if (result >= 18.5 && result <= 24.9)
      {
        category = "normal weight";
      }
      else if (result >= 25.0 && result <= 29.9)
      {
        category = "overweight";
      }
      else if (result >= 30.0)
      {
        category = "obese";
      }
      
      else
      {
        category = "unknown";
      }

      System.out.println("BMI Category: "+ category);


    }
}