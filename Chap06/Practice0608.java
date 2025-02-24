import java.util.Scanner;

public class Practice0608 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("要素数：");
        int n = stdIn.nextInt();

        double[] a = new double[n];

        double sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextDouble();
            sum += a[i];
        }

        System.out.println("全要素の合計値は" + sum + "です。");
        System.out.println("全要素の平均値は" + (sum / n) + "です。");
    }
}
