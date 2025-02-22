import java.util.Scanner;

public class Practice0417 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値：");
        int n = stdIn.nextInt();

        int div = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
                div++;
            }
        }
        System.out.println("約数は" + div + "個です。");
    }
}
