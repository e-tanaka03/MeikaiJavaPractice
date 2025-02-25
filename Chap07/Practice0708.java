import java.util.Random;
import java.util.Scanner;

public class Practice0708 {
    static int randomo(int a, int b){
        Random rand = new Random();
        int val = a;
        if(a < b){
            val = a + rand.nextInt((b - a));
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a以上b未満の乱数を生成します。");
        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();
        
        System.out.println("a以上b未満の乱数は" + randomo(a, b) + "です。");

    }
}
