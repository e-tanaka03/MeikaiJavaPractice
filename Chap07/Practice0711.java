import java.util.Scanner;

public class Practice0711 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int x = stdIn.nextInt();
        System.out.print("シフトするビット数：");
        int n = stdIn.nextInt();

        System.out.println("x << n = " + (x << n));
        System.out.println("x >> n = " + (x >> n));
        System.out.println("x >>> n = " + (x >>> n));
    }
}
