import java.util.Random;
import java.util.Scanner;

public class Practice0610 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = 1 + rand.nextInt(10);
            if ((i > 0) && (a[i - 1] == a[i])) {
                do{
                    a[i] = 1 + rand.nextInt(10);
                }while(a[i - 1] == a[i]);
            }
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
