import java.util.Random;

public class Practice0209 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        double x = rand.nextDouble();
        System.out.println("0.0以上1.0未満の実数地のランダム数は：" + x + "です。");

        double y = rand.nextDouble(10.0);
        System.out.println("0.0以上10.0未満の実数地のランダム数は：" + y + "です。");
        
        double z = rand.nextDouble(2.0) - 1.0;
        System.out.println("-1.0以上1.0未満の実数地のランダム数は：" + z + "です。");
    }
}
