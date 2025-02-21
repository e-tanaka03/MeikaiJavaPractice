import java.util.Scanner;

public class Practice0314 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();

        int min, max;

        if (a == b) {
            System.out.println("二つの値は同じです。");
        }
        else{
            if (a < b) {
                min = a;
                max = b;
            }
            else{
                min = b;
                max = a;
            }
            System.out.println("小さいほうの値は" + min + "です。");
            System.out.println("小さいほうの値は" + max + "です。");
        }
    }
}
