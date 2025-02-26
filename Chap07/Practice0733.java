import java.util.Scanner;

public class Practice0733 {
    static int countSignDigit(int a){
        int count = 0;
        if(a < 0){
            count++;
            a = -a;
        }
        do {
            a /= 10;
            count++;
        } while (a > 0);

        return count;
    }

    static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void printArray(int[][] a){
        int max_row = a[0].length;

        for(int i = 0; i < a.length; i++){
            if(max_row < a[i].length){
                max_row = a[i].length;
            }
        }

        int[] max_digit = new int[max_row];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(max_digit[j] < countSignDigit(a[i][j])){
                    max_digit[j] = countSignDigit(a[i][j]);
                }
            }
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");

                if(max_digit[j] > countSignDigit(a[i][j])){
                    for(int k = 0; k < max_digit[j] - countSignDigit(a[i][j]); k++){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("配列xの要素数 : ");
        int n = stdIn.nextInt();

        int[] x = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("１次元配列の表示");
        printArray(x);

        System.out.print("２次元配列yの行数 : ");
        int row = stdIn.nextInt();

        int[][] y = new int[row][];

        for(int i = 0; i < row; i++){
            System.out.print((i + 1) + "行目の列数 : ");
            int col = stdIn.nextInt();
            y[i] = new int[col];

            for(int j = 0; j < col; j++){
                System.out.print("y[" + i + "][" + j + "] : ");
                y[i][j] = stdIn.nextInt();
            }
        }

        System.out.println("２次元配列の表示");
        printArray(y);
    }
}
