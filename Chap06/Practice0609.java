import java.util.Random;
import java.util.Scanner;

public class Practice0609 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = 1 + rand.nextInt(10);
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
