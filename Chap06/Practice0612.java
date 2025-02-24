import java.util.Random;
import java.util.Scanner;

public class Practice0612 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = 10 + rand.nextInt(90);
            System.out.println("a[" + i + "] = " + a[i]);
        }

        int[] shuffle = new int[n];
        for(int i = 0; i < n; i++){
            shuffle[i] = rand.nextInt(n);
            if (i > 0) {
                for(int j = 0; j < i; j++){
                    if(shuffle[i] == shuffle[j]){
                        do{
                            shuffle[i] = rand.nextInt(n);
                        }while(shuffle[i] == shuffle[j]);
                        j = 0;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            int t = a[shuffle[i]];
            a[shuffle[i]] = a[i];
            a[i] = t;
        }
        System.out.println("要素の並びをシャッフルしました。");
        for(int i = 0; i < n; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
