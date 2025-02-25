import java.util.Scanner;

public class Practice0717 {
    static int linearSearchR(int[] a, int key){
        for(int i = a.length - 1; i >= 0; i--){
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }
        System.out.print("探す値：");
        int ky = stdIn.nextInt();

        int idx = linearSearchR(x, ky);

        if (idx == -1) {
            System.out.println("その値の要素は存在しません。");
        }
        else{
            System.out.println("その値はx[" + idx + "]にあります。");
        }
    }
}
