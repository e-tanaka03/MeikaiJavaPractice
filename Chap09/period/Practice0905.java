import java.util.Scanner;

public class Practice0905 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("期間開始年：");
        int start_y = stdIn.nextInt();
        System.out.print("期間開始月：");
        int start_m = stdIn.nextInt();
        System.out.print("期間開始日：");
        int start_d = stdIn.nextInt();
        System.out.print("期間終了年：");
        int end_y = stdIn.nextInt();
        System.out.print("期間終了月：");
        int end_m = stdIn.nextInt();
        System.out.print("期間終了日：");
        int end_d = stdIn.nextInt();

        Period p1 = new Period(new Day(start_y, start_m, start_d), new Day(end_y, end_m, end_d));
        System.out.println(p1);
    }
}
