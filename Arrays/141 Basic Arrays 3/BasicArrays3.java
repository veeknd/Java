import java.util.Random;

public class BasicArrays3{
    public static void main(String[] args){
        int[] arr = new int[1000];
        Random r = new Random();
        for (int i=0; i < arr.length;i++){
            arr[i]=  r.nextInt(10,100);

        }
        int linecount =0;
        for(int j =0;j<arr.length;j++){
            if (linecount == 20){
                System.out.println(" ");
                linecount = 0;
            }
            System.out.print(arr[j] + " ");
            linecount +=1;
        }
    }
}