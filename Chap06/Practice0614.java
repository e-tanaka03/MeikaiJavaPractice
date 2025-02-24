import java.util.Random;
import java.util.Scanner;

public class Practice0614 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        Scanner stdSIn = new Scanner(System.in);
        String[] monthString = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December",
        };

        System.out.println("英語の月名を入力してください。");
        System.out.println("なお、先頭は大文字で、２文字目以降は小文字とします。");

        int cont = 1;
        int month_before = -1;
        do{
            int month = rand.nextInt(12);
            if(month == month_before){
                do{
                    month = rand.nextInt(12);
                }while(month == month_before);
            }
            String ans = "";
            do{
                System.out.print((month+1) + "月：");
                ans = stdSIn.nextLine();
                if (!ans.equals(monthString[month])) {
                    System.out.println("違います。");
                }
            }while(!ans.equals(monthString[month]));
            month_before = month;

            System.out.print("正解です。もう一度？ 1･･･Yes／0･･･No：");
            cont = stdIn.nextInt();
        }while (cont != 0);
    }
}
