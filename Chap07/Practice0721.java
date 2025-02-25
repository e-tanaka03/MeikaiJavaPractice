import java.util.Scanner;

public class Practice0721 {
    static void aryExchng(int[] a, int[] b){
        int[] temp = new int[b.length];
        for(int i = 0; i < b.length; i++){
            temp[i] = b[i];
        }

        if(a.length < b.length){
            for(int i = 0; i < a.length; i++){
                b[i] = a[i];
                a[i] = temp[i];
            }
        }
        else{
            for(int i = 0; i < b.length; i++){
                b[i] = a[i];
                a[i] = temp[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("配列aの要素数：");
        int na = stdIn.nextInt();

        int[] a = new int[na];

        for(int i = 0; i < na; i++){
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("配列bの要素数：");
        int nb = stdIn.nextInt();

        int[] b = new int[nb];

        for(int i = 0; i < nb; i++){
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }

        aryExchng(a, b);
        System.out.println("配列aと配列bの全要素の値を交換しました。");

        for(int i = 0; i < na; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println();
        for(int i = 0; i < nb; i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}
