import java.util.Scanner;

public class Practice0616 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        final int[][] a = new int[4][3];
        final int[][] b = new int[3][4];

        System.out.println("４行３列の行列と３行４列の行列の積を求めます。");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print("a[" + i + "]" + "[" + j + "] = ");
                a[i][j] = stdIn.nextInt();
            }
        }

        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.print("b[" + i + "]" + "[" + j + "] = ");
                b[i][j] = stdIn.nextInt();
            }
        }

        final int[][] c = { {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0} };

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++){
                for(int k = 0; k < a[i].length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("行列積の結果c[4][4]は");
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.println("c[" + i + "][" + j + "] = " + c[i][j]);
            }
        }
    }
}
