public class Practice0506 {
    public static void main(String[] args) {
        float sum = 0.0F;

        System.out.println("  float      int   ");
        System.out.println("-------------------");
        for(int i = 0; i <= 1000; i++){
            System.out.printf("%8.7f %8.7f\n", sum, (float)i / 1000);
            sum += 0.001;
        }
    }    
}
