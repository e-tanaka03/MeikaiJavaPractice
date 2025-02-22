import java.util.Scanner;

public class Practice0421_upperright {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("右上直角の三角形を表示します。");
        System.out.print("段数は：");
        int n = stdIn.nextInt();

        for(int i = 0; i < n; i++){
            int k = 0;
            for(int j = 0; j < i; j++){
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
