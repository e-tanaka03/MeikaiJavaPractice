import java.util.Scanner;

public class Practice0718 {
    static void aryRmv(int[] a, int idx){
        for(int i = idx; i < a.length; i++){
            if (i < a.length - 1) {
                a[i] = a[i + 1];
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

        System.out.println("n番目の要素を削除します。");
        System.out.print("n : ");
        int n = stdIn.nextInt();

        aryRmv(x, n);

        System.out.println(n + "番目の要素を削除しました。");
        for(int i = 0; i < x.length; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
