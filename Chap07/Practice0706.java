import java.util.Scanner;

public class Practice0706 {
    static void printSeason(int m){
        switch (m) {
            case 3:
            case 4:
            case 5:
                System.out.print("春");
                break;

            case 6:
            case 7:
            case 8:
                System.out.print("夏");
                break;
                
            case 9:
            case 10:
            case 11:
                System.out.print("秋");
                break;
                
            case 12:
            case 1:
            case 2:
                System.out.print("冬");
                break;
        
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("指定した月の季節を表示します。\n何月：");
        int m = stdIn.nextInt();

        System.out.print(m + "月は");
        printSeason(m);
        System.out.println("です。");
    }
}
