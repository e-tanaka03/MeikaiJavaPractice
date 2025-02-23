import java.util.Random;
import java.util.Scanner;

public class Practice0427 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100);

        System.out.println("数当てゲーム開始！！");
        System.out.println("0～99の数を当ててください。");
        System.out.print("何回まで回答しますか：");
        int n = stdIn.nextInt();

        
        int x;
        boolean ans = false;
        for(int i = 0; i < n; i++){
            System.out.print("いくつかな：");
            x = stdIn.nextInt();

            if (x > no) {
                System.out.println("もっと小さな数だよ。");
            }
            else if (x < no) {
                System.out.println("もっと大きな数だよ。");
            }
            else{
                ans = true;
            }
        }

        if (ans) {
            System.out.println("正解です。");
        }
        else{
            System.out.println("正解は" + no + "でした。");
        }
    }
}
