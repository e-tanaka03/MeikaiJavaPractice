import java.util.Scanner;

public class Practice0716 {
    static int minOf(int[] a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
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

        System.out.println("最小値は" + minOf(a) + "です。");
    }
}
