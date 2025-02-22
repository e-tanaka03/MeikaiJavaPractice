import java.util.Random;
import java.util.Scanner;

public class Practice0402 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(90) + 10;

        System.out.println("数当てゲーム開始！！");
        System.out.print("10～99の数を当ててください。");

        int x;
        do{
            System.out.print("いくつかな：");
            x = stdIn.nextInt();

            if (x > no) {
                System.out.println("もっと小さい数だよ。");
            }
            else if (x < no) {
                System.out.println("もっと大きい数だよ。");
            }
        }while(x != no);

        System.out.println("正解です。");
    }
}
