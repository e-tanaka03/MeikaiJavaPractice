import java.util.Scanner;

public class Practice0713 {
    static void printBits(int x){
        for(int i = 31; i >= 0; i--){
            System.out.print((((x >>> i) & 1) == 1) ? '1' : '0');
        }
    }
    
    static int set(int x, int pos){
        int a = 1 << pos;

        return x | a;
    }

    static int reset(int x, int pos){
        int a = (~0) ^ (1 << pos);

        return x & a;
    }

    static int inverse(int x, int pos){
        int a = 1 << pos;

        return x ^ a;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int x = stdIn.nextInt();
        System.out.print("操作するposビット：");
        int pos = stdIn.nextInt();

        System.out.print(  "整数                        = ");
        printBits(x);
        System.out.print("\nint set(    int x, int pos) = ");
        printBits(set(x, pos));
        System.out.print("\nint reset(  int x, int pos) = ");
        printBits(reset(x, pos));
        System.out.print("\nint inverse(int x, int pos) = ");
        printBits(inverse(x, pos));
        System.out.println();
    }
}
