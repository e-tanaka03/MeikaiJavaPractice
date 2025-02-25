import java.util.Scanner;

public class Practice0704 {
    static int sumUp(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの全整数の和を求めます。");
        System.out.print("整数n：");
        int n = stdIn.nextInt();

        System.out.println("和は" + sumUp(n) + "です。");
    }
}
