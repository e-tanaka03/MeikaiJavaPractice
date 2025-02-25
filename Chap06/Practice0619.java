import java.util.Scanner;

public class Practice0619 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[][] c;
        System.out.print("クラス数：");
        int row = stdIn.nextInt();
        c = new int[row][];

        System.out.println();
        int student_num = 0;
        int all_sum = 0;
        int[] class_sum = new int[row];
        for(int i = 0; i < row; i++){
            System.out.print((i + 1) + "組の人数：");
            int col = stdIn.nextInt();
            c[i] = new int[col];
            student_num += col;
            class_sum[i] = 0;
            for(int j = 0; j < col; j++){
                System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
                c[i][j] = stdIn.nextInt();
                class_sum[i] += c[i][j];
                all_sum += c[i][j];
            }
            System.out.println();
        }
        
        System.out.println("  組 |   合計   平均 ");
        System.out.println("-----+---------------");
        for(int i = 0; i < c.length; i++){
            System.out.printf(" " + (i + 1) + "組 | %6d %6.1f\n", class_sum[i], ((double)class_sum[i] / (double)c[i].length));
        }
        System.out.println("-----+---------------");
        System.out.printf("  計 | %6d %6.1f\n", all_sum, ((double)all_sum / (double)student_num));

    }
}
