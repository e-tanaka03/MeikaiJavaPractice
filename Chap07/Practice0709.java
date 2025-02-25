import java.util.Scanner;

public class Practice0709 {
    static int readPlusInt(){
        Scanner stdIn = new Scanner(System.in);
        int n;
        do{
            System.out.print("正の整数値：");
            n = stdIn.nextInt();
        }while(n <= 0);

        return n;
    }

    public static void main(String[] args) {
        int n = readPlusInt();

        System.out.println("返却された値は" + n + "です。");
    }
}
