public class Practice1504 {
    public static void printDouble(double x, int p, int w){
        System.out.printf(String.format("%%%d.%df\n", w, p), x);
    }
    
    public static void main(String[] args) {
        double x = 12.54637;
        int w = 10;
        int p = 7;

        printDouble(x, p, w);
    }
}
