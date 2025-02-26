import java.util.Scanner;

public class Practice0732 {
    static void printBits(byte x){
        for(int i = 7; i >= 0; i--){
            System.out.print((((x >>> i) & 1) == 1) ? '1' : '0');
        }
        System.out.println();
    }

    static void printBits(short x){
        for(int i = 15; i >= 0; i--){
            System.out.print((((x >>> i) & 1) == 1) ? '1' : '0');
        }
        System.out.println();
    }

    static void printBits(int x){
        for(int i = 31; i >= 0; i--){
            System.out.print((((x >>> i) & 1) == 1) ? '1' : '0');
        }
        System.out.println();
    }

    static void printBits(long x){
        for(int i = 63; i >= 0; i--){
            System.out.print((((x >>> i) & 1) == 1) ? '1' : '0');
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("byte型整数a : ");
        byte a = stdIn.nextByte();
        System.out.print("short型整数b : ");
        short b = stdIn.nextShort();
        System.out.print("int型整数c : ");
        int c = stdIn.nextInt();
        System.out.print("long型整数d : ");
        long d = stdIn.nextLong();

        System.out.print(" byte型整数a = ");
        printBits(a);
        System.out.print("short型整数b = ");
        printBits(b);
        System.out.print("  int型整数c = ");
        printBits(c);
        System.out.print(" long型整数d = ");
        printBits(d);
    }
}
