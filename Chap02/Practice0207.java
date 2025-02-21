import java.util.Random;

public class Practice0207 {
    public static void main(String[] args) {
        Random rand = new Random();

        int x = rand.nextInt(8) + 1;
        System.out.println("1桁の正の整数値のランダム数は：" + x + "です。");

        int y = -(rand.nextInt(8)) - 1;
        System.out.println("1桁の負の整数値のランダム数は：" + y + "です。");
        
        int z = rand.nextInt(90) + 10;
        System.out.println("2桁の正の整数値のランダム数は：" + z + "です。");
    }
}
