import java.util.Scanner;

public class Agein5{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello. What is your name?");
        String name = keyboard.next();
        System.out.print("Hi, " + name + "! How old are you?");
        int age = keyboard.nextInt();
        System.out.print("Did you know in five years you will be "+ (age+5) + " years old?");

    }
}