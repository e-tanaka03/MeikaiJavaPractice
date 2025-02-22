import java.util.Scanner;

public class Practice0421_lowerright {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("右下直角の三角形を表示します。");
        System.out.print("段数は：");
        int n = stdIn.nextInt();

        for(int i = n; i > 0; i--){
            int k = 0;
            for(int j = i - 1; j > 0; j--){
                System.out.print(' ');
                k++;
            }
            for(int j = n - k; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
