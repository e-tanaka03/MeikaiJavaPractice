public class Practice0603 {
    public static void main(String[] args) {
        double[] a = new double[5];

        for(int i = 1; i <= a.length; i++){
            a[i - 1] = i + (i * 0.1);
        }

        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
