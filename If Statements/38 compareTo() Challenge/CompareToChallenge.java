// compare string and print their int return values
// need to print 5 negative comparison and 5 positive and 2 zero comparisons

public class CompareToChallenge
{
    public static void main (String[] args)
    {
        System.out.print("Comparing Young with Young:");
        int i = "Young".compareTo("Young");
        System.out.println(i);

        System.out.print("Comparing apple with apple:");
        i = "apple".compareTo("apple");
        System.out.println(i);

        System.out.print("Comparing pineapple with apple:");
        i = "pineapple".compareTo("apple");
        System.out.println(i);

        System.out.print("Comparing Aaple with ineapple:");
        i = "Apple".compareTo("pineapple");
        System.out.println(i);

        System.out.print("Comparing Aaple with Aneapple:");
        i = "Apple".compareTo("Aneapple");
        System.out.println(i);

        System.out.print("Comparing A with pineapple:");
        i = "A".compareTo("pineapple");
        System.out.println(i);

        System.out.print("Comparing A with Pineapple:");
        i = "A".compareTo("Pineapple");
        System.out.println(i);

        System.out.print("Comparing Aaple with Zineapple:");
        i = "Cpple".compareTo("Yineapple");
        System.out.println(i);

    }
}