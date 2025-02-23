import java.util.Scanner;

public class SumBreak2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数を加算します。");
        System.out.print("何個加算しますか：");
        int n = stdIn.nextInt();

        int sum = 0;
        int ave = 0;
        for(int i = 0; i < n; i++){
            System.out.print("整数：");
            int t = stdIn.nextInt();
            if (sum + t > 1000) {
                System.out.println("合計が1,000を超えました。");
                System.out.println("最後の計算は無視します。");
                break;
            }
            sum += t;
            ave++;
        }
        ave = sum / ave;
        System.out.println("合計は" + sum + "です。");
        System.out.println("平均は" + ave + "です。");
        
    }
}
