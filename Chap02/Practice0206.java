import java.util.Scanner;

public class Practice0206 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("底辺：");
        double x = stdIn.nextDouble();
        
        System.out.print("高さ：");
        double y = stdIn.nextDouble();

        System.out.println("面積は" + (x * y) / 2 + "です。");
        
    }
}
