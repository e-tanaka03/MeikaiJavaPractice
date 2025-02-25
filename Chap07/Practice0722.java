import java.util.Scanner;

public class Practice0722 {
    static int[] arrayClone(int[] a){
        int[] clone = new int[a.length];

        for(int i = 0; i < a.length; i++){
            clone[i] = a[i];
        }

        return clone;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数は：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        int[] clone = arrayClone(a);
        System.out.println("配列aと同じ配列を生成しました。");

        for(int i = 0; i < clone.length; i++){
            System.out.println("clone[" + i + "] = " + clone[i]);
        }
    }
}
