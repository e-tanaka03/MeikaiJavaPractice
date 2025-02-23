import java.util.Scanner;

public class Practice0501 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int n = stdIn.nextInt();

        System.out.printf("８進数では%oです。\n", n);
        System.out.printf("16進数では%xです。\n", n);
    }
}