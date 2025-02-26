import java.util.Scanner;

public class Practice0725 {
    static int[] arrayRmvOfN(int[] a, int idx, int n){
        int[] ret = new int[a.length - n];

        for(int i = 0; i < idx; i++){
            ret[i] = a[i];
        }
        for(int i = idx + n - 1; i < a.length; i++){
            ret[i - (idx + n - 1)] = a[i];
        }

        return ret;
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

        System.out.println("n番目からm個削除した配列を作成します。");
        System.out.print("n : ");
        int n = stdIn.nextInt();
        System.out.print("m : ");
        int m = stdIn.nextInt();

        int[] delarray = arrayRmvOfN(x, n, m);

        System.out.println(n + "番目から" + m +"個削除しました。");
        for(int i = 0; i < delarray.length; i++){
            System.out.println("delarray[" + i + "] = " + delarray[i]);
        }
    }
}
