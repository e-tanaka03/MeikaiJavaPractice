import java.util.Scanner;

public class Practice0318 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("季節を求めます。\n何月ですか：");
        int month = stdIn.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("それは春です。");
                break;
            
            case 6:
            case 7:
            case 8:
                System.out.println("それは夏です。");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("それは秋です。");
                break;
            
            case 12:
            case 1:
            case 2:
                System.out.println("それは冬です。");
                break;
                
            default:
                break;
        }
    }
}
