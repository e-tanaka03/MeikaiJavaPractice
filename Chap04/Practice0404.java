import java.util.Scanner;

public class Practice0404 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.err.println("カウントダウンします。");
        int x;
        do{
            System.out.print("正の整数値：");
            x = stdIn.nextInt();
        }while(x <= 0);

        while (x >= 0) {
            System.out.println(x);
            x--;
        }

        System.out.println("while文終了時のxの値：" + x);
    }
}
