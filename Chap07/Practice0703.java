import java.util.Scanner;

public class Practice0703 {
    static int med(int a, int b, int c){
        int med = a;
        if(med < b){
            if(b < c){
                med = b;
            }
            else{
                if(med < c){
                    med = c;
                }
            }
        }
        else{
            if(c < med){
                if(b < c){
                    med = c;
                }
                else{
                    med = b;
                }
            }
        }
        return med;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();
        System.out.print("整数b：");
        int b = stdIn.nextInt();
        System.out.print("整数c：");
        int c = stdIn.nextInt();

        System.out.println("中央値は" + med(a, b, c) + "です。");
    }
}
