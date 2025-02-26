import java.util.Scanner;

public class Practice0729 {
    static int[][] aryClone2(int[][] a){
        int[][] ret = new int[a.length][];

        for(int i = 0; i < a.length; i++){
            ret[i] = new int[a[i].length];
            for(int j = 0; j < a[i].length; j++){
                ret[i][j] = a[i][j];
            }
        }

        return ret;
    }

    static void printMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("2次元配列aの行数：");
        int row = stdIn.nextInt();
        System.out.print("2次元配列aの列数：");
        int col = stdIn.nextInt();

        int[][] x = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("x[" + i + "][" + j + "] : ");
                x[i][j] = stdIn.nextInt();
            }
        }

        System.out.println("2次元配列aと同じ配列を生成しました。");
        int[][] clonearray = aryClone2(x);

        printMatrix(clonearray);
    }
}
