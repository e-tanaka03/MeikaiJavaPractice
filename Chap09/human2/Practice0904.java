import java.util.Scanner;

public class Practice0904 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("あなたのデータを入力してください。");
        System.out.print("お名前は：");
        String name = stdIn.nextLine();
        System.out.print("身長は：");
        double hight = stdIn.nextDouble();
        System.out.print("体重は：");
        double weight = stdIn.nextDouble();
        System.out.print("誕生年：");
        int y = stdIn.nextInt();
        System.out.print("誕生月：");
        int m = stdIn.nextInt();
        System.out.print("誕生日：");
        int d = stdIn.nextInt();

        Human h1 = new Human(name, hight, weight, new Day(y, m, d));

        System.out.println();
        System.out.println("■個人情報");
        System.out.println(h1);
    }
}
