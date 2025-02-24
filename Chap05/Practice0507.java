public class Practice0507 {
    public static void main(String[] args) {
        for(float x = 0.0F; x <= 1.0F; x += 0.001F){
            System.out.printf("%8.7f %8.7f\n", x, x*x);
        }
    }
}
