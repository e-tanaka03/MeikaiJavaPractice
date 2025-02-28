import java.util.Scanner;
import shape2.*;

public class Practice1302 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("二等辺三角形は何個：");
        int n = stdIn.nextInt();

        Shape[] p = new Shape[n];

        for(int i = 0; i < n; i++){
            int s;
            do {
                System.out.print((i + 1) + "番の図形の種類 (1･･･左下直角／2･･･左上直角／3･･･右下直角／4･･･右上直角) : ");
                s = stdIn.nextInt();
    
                if (s == 1) {
                    System.out.print("段数 : ");
                    int step = stdIn.nextInt();
                    p[i] = new IsoscelesTriangleLB(step);
                }
                else if (s == 2) {
                    System.out.print("段数 : ");
                    int step = stdIn.nextInt();
                    p[i] = new IsoscelesTriangleLU(step);
                }
                else if (s == 3) {
                    System.out.print("段数 : ");
                    int step = stdIn.nextInt();
                    p[i] = new IsoscelesTriangleRB(step);
                }
                else if (s == 4) {
                    System.out.print("段数 : ");
                    int step = stdIn.nextInt();
                    p[i] = new IsoscelesTriangleRU(step);
                }
            } while (!((1 <= s) && (s <= 4)));
        }

        for(Shape s : p){
            s.print();
            System.out.println();
        }
    }
}
