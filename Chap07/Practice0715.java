import java.util.Scanner;

public class Practice0715 {
    static int sumOf(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("配列の要素数：");
        int n = stdIn.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("配列の各要素の合計は" + sumOf(a) + "です。");
    }
}
