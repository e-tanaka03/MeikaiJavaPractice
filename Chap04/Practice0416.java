import java.util.Scanner;

public class Practice0416 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個*を表示しますか：");
        int n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print('*');
            if((i % 5) == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
