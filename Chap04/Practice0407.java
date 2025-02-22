import java.util.Scanner;

public class Practice0407 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個表示しますか：");
        int n = stdIn.nextInt();

        int i = 0;
        while (i < n) {
            if((i % 2) == 0){
                System.out.print('*');
            }
            else{
                System.out.print('+');
            }
            i++;
        }

        if (n >= 1) {
            System.out.println();
        }
    }
}
