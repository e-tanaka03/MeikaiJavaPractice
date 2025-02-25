import java.util.Random;
import java.util.Scanner;

public class Practice0710 {
    static Scanner stdIn = new Scanner(System.in);

    static boolean confirmRetry(){
        int cont;
        do{
            System.out.print("もう一度？<Yes･･･1／No･･･0>");
            cont = stdIn.nextInt();
        }while(cont != 0 && cont != 1);
        return cont == 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        String[] sign = {" + ", " - "};

        System.out.println("暗算力トレーニング!!");
        do{
            int x = rand.nextInt(900) + 100;
            int y = rand.nextInt(900) + 100;
            int z = rand.nextInt(900) + 100;

            int s1 = rand.nextInt(2);
            int s2 = rand.nextInt(2);

            int sum = 0;
            if(s1 == 0){
                sum = x + y;
            }
            else{
                sum = x - y;
            }

            if(s2 == 0){
                sum += z;
            }
            else{
                sum -= z;
            }
            while (true) {
                System.out.print(x + sign[s1] + y + sign[s2] + z + " = ");
                int k = stdIn.nextInt();
                if (k == sum) {
                    break;
                }
                System.out.println("違いますよ!!");
            }
        }while(confirmRetry());
    }
}
