import java.util.Scanner;

public class Practice0719 {
    static void aryRmvN(int[] a, int idx, int n){
        for(int i = idx; i < a.length; i++){
            if (i + n < a.length) {
                a[i] = a[i + n];
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < x.length; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("n番目からm個削除します。");
        System.out.print("n : ");
        int n = stdIn.nextInt();
        System.out.print("m : ");
        int m = stdIn.nextInt();

        aryRmvN(x, n, m);

        System.out.println(n + "番目から" + m +"個削除しました。");
        for(int i = 0; i < x.length; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
