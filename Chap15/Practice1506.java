import static java.lang.Math.PI;

public class Practice1506 {
    public static void main(String[] args) {
        System.out.println("円周の長さ : " + (2 * PI * Double.parseDouble(args[0])));
        System.out.println("円の面積 : " + (PI * Double.parseDouble(args[0]) * Double.parseDouble(args[0])));
    }
}
