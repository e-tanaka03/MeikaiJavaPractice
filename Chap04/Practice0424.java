import java.util.Scanner;

public class Practice0424 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("素数か判定します。\n正の整数値：");
        int n = stdIn.nextInt();

        boolean judge = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                judge = false;
                break;
            }
        }

        if (judge) {
            System.out.println("その数は素数です。");
        }
        else{
            System.out.println("その数は素数ではありません。");
        }
    }
}
