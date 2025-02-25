import java.util.Scanner;

public class Practice0712 {
    static void printBits(int x){
        for(int i = 31; i >= 0; i--){
            System.out.print((((x >>> i) & 1) == 1) ? '1' : '0');
        }
    }
    
    static int rRotate(int x, int n){
        int a = 1 << 31;
        int ret = x;
        for(int i = 0; i < n; i++){
            if (((x >>> i) & 1) == 1) {
                ret = (ret >>> 1) | a;
            }
            else{
                ret = ret >>> 1;
            }
        }

        return ret;
    }

    static int lRotate(int x, int n){
        int ret = x;
        for(int i = 31; i > 31 - n; i--){
            if (((x >>> i) & 1) == 1) {
                ret = (ret << 1) | 1;
            }
            else{
                ret = ret << 1;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int x = stdIn.nextInt();
        System.out.print("回転シフトするビット数：");
        int n = stdIn.nextInt();

        System.out.print(  "整数   = ");
        printBits(x);
        System.out.print("\nx >> n = ");
        printBits(rRotate(x, n));
        System.out.print("\nx << n = ");
        printBits(lRotate(x, n));
        System.out.println();
    }
}
