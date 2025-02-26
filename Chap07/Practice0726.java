import java.util.Scanner;

public class Practice0726 {
    static int[] arrayInsOf(int[] a, int idx, int x){
        int[] ret = new int[a.length + 1];

        for(int i = 0; i < idx; i++){
            ret[i] = a[i];
        }
        ret[idx] = x;
        for(int i = idx; i < a.length; i++){
            ret[i + 1] = a[i];
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

        System.out.println("n番目にmを挿入した配列を生成します。");
        System.out.print("n : ");
        int n = stdIn.nextInt();
        System.out.print("m : ");
        int m = stdIn.nextInt();

        int[] insarray = arrayInsOf(x, n, m);

        System.out.println(n + "番目に" + m +"を挿入しました。");
        for(int i = 0; i < insarray.length; i++){
            System.out.println("insarray[" + i + "] = " + insarray[i]);
        }
    }
}
