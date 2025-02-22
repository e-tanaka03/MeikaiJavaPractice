import java.util.Scanner;

public class Practice0421_upperleft {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("左上直角の三角形を表示します。");
        System.out.print("段数は：");
        int n = stdIn.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
