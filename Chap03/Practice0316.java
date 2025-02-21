import java.util.Scanner;

public class Practice0316 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();
        System.out.print("整数c:");
        int c = stdIn.nextInt();

        int min = a, med = b, max = c;
        if(b < a){
            if (c < a) {
                max = a;
                if (b < c) {
                    min = b;
                    med = c;
                }
                else{
                    min = c;
                    med = b;
                }
            }
            else{
                min = b;
                med = a;
            }
        }
        else{
            if (c < b) {
                med = c;
                max = b;
            }
            if (c < a) {
                min = c;
                med = a;
            }
        }
        a = min;
        b = med;
        c = max;
        System.out.println("昇順となるようにソートしました。");
        System.out.println("変数aは" + a + "です。");
        System.out.println("変数bは" + b + "です。");
        System.out.println("変数cは" + c + "です。");
    }
}
