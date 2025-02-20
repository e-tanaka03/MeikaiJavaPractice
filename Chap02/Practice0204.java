import java.util.Scanner;

public class Practice0204 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値：");
        int a = stdIn.nextInt();

        System.out.println("10を加えた値は" + (a + 10) + "です。");
        System.out.println("10を減じた値は" + (a - 10) + "です。");
        
    }
}
