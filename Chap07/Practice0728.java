public class Practice0728 {
    static int[][] addMatrix(int[][] x, int[][] y){
        int[][] ret = new int[x.length][];

        for(int i = 0; i < x.length; i++){
            ret[i] = new int[x[i].length];
            for(int j = 0; j < x[i].length; j++){
                ret[i][j] = x[i][j] + y[i][j];
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
        int[][] a = { {1, 2, 3}, {4, 5, 6} };
        int[][] b = { {6, 3, 4}, {5, 1, 2} };
        int[][] c = addMatrix(a, b);
        
        System.out.println("行列a");
        printMatrix(a);
        System.out.println("行列b");
        printMatrix(b);
        System.out.println("行列c");
        printMatrix(c);
}
}
