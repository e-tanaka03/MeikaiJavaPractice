import java.util.Scanner;

public class Practice0420 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数n：");
        int n = stdIn.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
