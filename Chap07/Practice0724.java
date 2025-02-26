import java.util.Scanner;

public class Practice0724 {
    static int[] arrayRmvOf(int[] a, int idx){
        int[] ret = new int[a.length-1];

        for(int i = 0; i < idx; i++){
            ret[i] = a[i];
        }
        for(int i = idx + 1; i < a.length; i++){
            ret[i - 1] = a[i];
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

        System.out.println("n番目の要素を削除した配列を作成します。");
        System.out.print("n : ");
        int n = stdIn.nextInt();

        int[] delarray = arrayRmvOf(x, n);

        System.out.println(n + "番目の要素を削除しました。");
        for(int i = 0; i < delarray.length; i++){
            System.out.println("delarray[" + i + "] = " + delarray[i]);
        }
    }
}
