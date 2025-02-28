import java.util.Scanner;
import shape3.*;

public class Practice1401 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("図形は何個：");
        int n = stdIn.nextInt();

        Shape[] p = new Shape[n];

        for(int i = 0; i < n; i++){
            int s;
            do {
                System.out.print((i + 1) + "番の図形の種類 (1･･･長方形／2･･･平行四辺形) : ");
                s = stdIn.nextInt();
    
                if (s == 1) {
                    System.out.print("幅 : ");
                    int width = stdIn.nextInt();
                    System.out.print("高さ : ");
                    int height = stdIn.nextInt();
                    p[i] = new Rectangle(width, height);
                }
                else if (s == 2) {
                    System.out.print("幅 : ");
                    int width = stdIn.nextInt();
                    System.out.print("高さ : ");
                    int height = stdIn.nextInt();
                    p[i] = new Parallelogram(width, height);
                }
            } while (!((1 <= s) && (s <= 2)));
        }

        for(Shape s : p){
            s.print();
            if (s instanceof Plane2D) {
                System.out.println("Area:" + ((Plane2D)s).getArea());
            }
            System.out.println();
        }
    }
}
