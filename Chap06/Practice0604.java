import java.util.Random;
import java.util.Scanner;

public class Practice0604 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = 1 + rand.nextInt(10);
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            if(max < a[i]){
                max = a[i];
            }
        }

        for(int i = max; i > 0; i--){
            for(int j = 0; j < n; j++){
                if(i <= a[j]){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
                System.out.print(' ');
            }
            System.out.println();
        }
        for(int i = 0; i < n*2 - 1; i++){
            System.out.print('-');
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(i % 10 + " ");
        }
        System.out.println();
    }
}
