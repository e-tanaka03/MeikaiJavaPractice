import java.util.Scanner;

public class Practice1005 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("口座のデータを入力せよ。");
        System.out.print("口座名義は：");
        String name = stdIn.nextLine();
        System.out.print("口座番号は：");
        String no = stdIn.nextLine();
        System.out.print("預金残高は：");
        long balance = stdIn.nextLong();
        System.out.print("口座開設年：");
        int y = stdIn.nextInt();
        System.out.print("口座開設月：");
        int m = stdIn.nextInt();
        System.out.print("口座開設日：");
        int d = stdIn.nextInt();

        Account acnt = new Account(name, no, balance, new Day(y, m, d));

        System.out.println();
        System.out.println("■口座情報");
        System.out.println(acnt);
    }
}