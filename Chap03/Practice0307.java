import java.util.Scanner;

public class Practice0307 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("正の整数値：");
        int n = stdIn.nextInt();

        if (n > 0) {
            if (n % 3 == 0) {
                System.out.println("その値は3で割り切れます。");
            }
            else if (n % 3 == 1) {
                System.out.println("その値を3で割ったあまりは1です。");
            }
            else{
                System.out.println("その値を3で割ったあまりは2です。");
            }
        }
        else{
            System.out.println("正でない値が入力されました。");
        }
    }
}
