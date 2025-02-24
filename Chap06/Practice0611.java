import java.util.Random;
import java.util.Scanner;

public class Practice0611 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int n = 0;
        do{
            System.out.print("要素数（10以下）：");
            n = stdIn.nextInt();
        }while(n > 10);

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = 1 + rand.nextInt(10);
            if (i > 0) {
                for(int j = 0; j < i; j++){
                    if(a[i] == a[j]){
                        do{
                            a[i] = 1 + rand.nextInt(10);
                        }while(a[i] == a[j]);
                        j = 0;
                    }
                }
            }
            System.out.println("a[" + i + "] = " + a[i]);
        }        
    }
}
