import java.util.Scanner;

public class Practice1603 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        try {
            for(int i = 0; i < a.length / 2; i++){
                swap(a, i, a.length - i - 1);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(1);
        }
        catch (NullPointerException e){
            System.out.println("配列が参照できません。" + e.getMessage());
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数 : ");
        int num = stdIn.nextInt();

        int[] x = null;

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("要素の並びを反転しました。");
        for(int i = 0; i < x.length; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
