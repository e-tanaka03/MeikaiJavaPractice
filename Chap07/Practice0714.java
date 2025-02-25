import java.util.Scanner;

public class Practice0714 {
    static void printBits(int x){
        for(int i = 31; i >= 0; i--){
            System.out.print((((x >>> i) & 1) == 1) ? '1' : '0');
        }
    }
    
    static int setN(int x, int pos, int n){
        int a = 0;
        for(int i = 0; i < n; i++){
            a = (a << 1) | 1;
        }
        a = a << pos;

        return x | a;
    }

    static int resetN(int x, int pos, int n){
        int a = (~0);
        for(int i = pos; i < pos + n; i++){
            a = a ^ (1 << i); 
        }

        return x & a;
    }

    static int inverseN(int x, int pos, int n){
        int a = 0;
        for(int i = pos; i < pos + n; i++){
            a = a | (1 << i);
        }

        return x ^ a;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int x = stdIn.nextInt();
        System.out.print("操作するposビット：");
        int pos = stdIn.nextInt();
        System.out.print("連続するn個のビット：");
        int n = stdIn.nextInt();


        System.out.print(  "整数                         = ");
        printBits(x);
        System.out.print("\nint setN(    int x, int pos) = ");
        printBits(setN(x, pos, n));
        System.out.print("\nint resetN(  int x, int pos) = ");
        printBits(resetN(x, pos, n));
        System.out.print("\nint inverseN(int x, int pos) = ");
        printBits(inverseN(x, pos, n));
        System.out.println();
    }
}
