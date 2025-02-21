import java.util.Scanner;

public class Practice0313 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();
        System.out.print("整数c:");
        int c = stdIn.nextInt();

        int med = a;
        if(a < b){
            if (b < c) {
                med = b;
            }
        }
        else{
            if (c < a) {
                med = c;
            }
        }
        System.out.println("中央値は" + med + "です。");
        
    }
}
