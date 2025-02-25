import java.util.Scanner;

public class Practice0618 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[][] c;
        System.out.print("行数：");
        int row = stdIn.nextInt();
        c = new int[row][];

        for(int i = 0; i < row; i++){
            System.out.print((i + 1) + "行目の列数：");
            int col = stdIn.nextInt();
            c[i] = new int[col];
        }

        System.out.println("各要素の値");
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.print("c[" + i + "][" + j + "] = ");
                c[i][j] = stdIn.nextInt();
            }
        }

        System.out.println();
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.printf("%3d", c[i][j]);
            }
            System.out.println();
        }
    }
}
