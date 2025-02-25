import java.util.Scanner;

public class Practice0720 {
    static void aryIns(int[] a, int idx, int x){
        for(int i = a.length - 1; i > idx; i--){
            a[i] = a[i - 1];
        }
        a[idx] = x;
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

        System.out.println("n番目にmを挿入します。");
        System.out.print("n : ");
        int n = stdIn.nextInt();
        System.out.print("m : ");
        int m = stdIn.nextInt();

        aryIns(x, n, m);

        System.out.println(n + "番目に" + m +"を挿入しました。");
        for(int i = 0; i < x.length; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
