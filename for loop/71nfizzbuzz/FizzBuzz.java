public class FizzBuzz
{
    public static void main(String[] args)
    {
        for(int n =0; n<=100; n++){
            if (n%5 == 0 && n%3 == 0){
                System.out.println("fizzbuzz");
            }
            else if (n%3 == 0){
                System.out.println("fizz");
            }
            else if (n%5 == 0){
                System.out.println("buzz");
            }
            else{
                System.out.println(n);
            }
        }
    }
}