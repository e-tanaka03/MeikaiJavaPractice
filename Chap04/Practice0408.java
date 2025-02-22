import java.util.Scanner;

public class Practice0408 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値：");
        int x = stdIn.nextInt();

        System.out.print("その値は");
        int i = 0;
        while (x > 0) {
            x /= 10;
            i++;
        }
        System.out.println(i + "桁です。");
    }
}
