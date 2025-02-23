import java.util.Scanner;

public class Practice0423 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("ピラミッドを表示します。");
        System.out.print("段数は：");
        int n = stdIn.nextInt();

        int k = 1;
        int num = 1;
        for(int i = n; i > 0; i--){
            for(int j = i - 1; j > 0; j--){
                System.out.print(' ');
            }
            for(int j = k; j > 0; j--){
                System.out.print((num % 10));
            }
            System.out.println();
            k += 2;
            num++;
        }
    }
}
