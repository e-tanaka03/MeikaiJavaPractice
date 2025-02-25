import java.util.Scanner;

public class Practice0723 {
    static int[] arraySrchIdx(int[] a, int x){
        int num = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] == x) {
                num++;
            }
        }

        int[] idxarray = new int[num];
        num = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] == x) {
                idxarray[num] = i;
                num++;
            }
        }

        return idxarray;
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

        System.out.print("配列aの要素の中で値がxであるものを探索：");
        int x = stdIn.nextInt();

        int[] idxarray = arraySrchIdx(a, x);
        System.out.println("配列aの要素の中で" + x + "であるものは");

        System.out.print("{");
        for(int i = 0; i < idxarray.length; i++){
            System.out.print(idxarray[i]);
            if(i < idxarray.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
