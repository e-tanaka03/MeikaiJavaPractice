import java.util.Scanner;
import shape2.*;

public class Practice1301 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("図形は何個：");
        int n = stdIn.nextInt();

        Shape[] p = new Shape[n];

        for(int i = 0; i < n; i++){
            int s;
            do {
                System.out.print((i + 1) + "番の図形の種類 (1･･･点／2･･･水平直線／3･･･垂直直線／4･･･長方形) : ");
                s = stdIn.nextInt();
    
                if (s == 1) {
                    p[i] = new Point();
                }
                else if (s == 2) {
                    System.out.print("長さ : ");
                    int length = stdIn.nextInt();
                    p[i] = new HorzLine(length);
                }
                else if (s == 3) {
                    System.out.print("長さ : ");
                    int length = stdIn.nextInt();
                    p[i] = new HorzLine(length);
                }
                else if (s == 4) {
                    System.out.print("幅 : ");
                    int width = stdIn.nextInt();
                    System.out.print("高さ : ");
                    int height = stdIn.nextInt();
                    p[i] = new Rectangle(width, height);
                }
            } while (!((1 <= s) && (s <= 4)));
        }

        for(Shape s : p){
            s.print();
            System.out.println();
        }
    }
}
