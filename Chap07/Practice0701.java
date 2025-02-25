import java.util.Scanner;

public class Practice0701 {
    static int signOf(int n){
        int ret;
        if(n > 0){
            ret = 1;
        }
        else if (n < 0) {
            ret = -1;
        }
        else{
            ret = 0;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値：");
        int n = stdIn.nextInt();

        System.out.println(signOf(n));
    }
}