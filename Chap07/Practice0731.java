import java.util.Scanner;

public class Practice0731 {
    static int absolute(int x){
        if (x >= 0) {
            return x;
        }
        else{
            return -x;
        }
    }
    
    static long absolute(long x){
        if (x >= 0) {
            return x;
        }
        else{
            return -x;
        }
    }

    static float absolute(float x){
        if (x >= 0) {
            return x;
        }
        else{
            return -x;
        }
    }

    static double absolute(double x){
        if (x >= 0) {
            return x;
        }
        else{
            return -x;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("int型整数値a : ");
        int a = stdIn.nextInt();
        System.out.println("aの絶対値は" + absolute(a) + "です。");
        
        System.out.print("long型整数値b : ");
        long b = stdIn.nextLong();
        System.out.println("bの絶対値は" + absolute(b) + "です。");
        
        System.out.print("float型実数値c : ");
        float c = stdIn.nextFloat();
        System.out.println("cの絶対値は" + absolute(c) + "です。");

        System.out.print("double型実数値d : ");
        double d = stdIn.nextDouble();
        System.out.println("dの絶対値は" + absolute(d) + "です。");
    }
}
