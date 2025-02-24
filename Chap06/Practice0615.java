import java.util.Random;
import java.util.Scanner;

public class Practice0615 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        Scanner stdSIn = new Scanner(System.in);
        String[] weekString = {
            "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
        };
        String[] weekString_JP = {
            "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"
        };

        System.out.println("英語の曜日名を小文字で入力してください。");

        int cont = -1;
        int week_before = -1;
        do{
            int week = rand.nextInt(7);
            if(week == week_before){
                do{
                    week = rand.nextInt(7);
                }while(week == week_before);
            }
            String ans = "";
            do{
                System.out.print(weekString_JP[week] + "：");
                ans = stdSIn.nextLine();
                if (!ans.equals(weekString[week])) {
                    System.out.println("違います。");
                }
            }while(!ans.equals(weekString[week]));
            week_before = week;

            System.out.print("正解です。もう一度？ 1･･･Yes／0･･･No：");
            cont = stdIn.nextInt();
        }while (cont != 0);
    }
}
