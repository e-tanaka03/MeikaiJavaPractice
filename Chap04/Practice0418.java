import java.util.Scanner;

public class Practice0418 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("nの値：");
        int n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println( i + "の２乗は" + (i * i));
        }
    }
}
