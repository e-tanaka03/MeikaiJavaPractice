import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Practice1508 {
    public static boolean isLeap(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int dayOfWeek(int year, int month, int date){
        if(month == 1 || month == 2){
            year--;
            month += 12;
        }
        return (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + date) % 7;
    }

    public static void printCalender(int year, int month){
        int[] DayMax =     {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] LeapDayMax = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("     " + year + "年 " + month + "月");
        System.out.println("日 月 火 水 木 金 土");

        if (isLeap(year)) {
            for(int i = 1; i <= LeapDayMax[month - 1]; i++){
                if (i == 1) {
                    for(int j = 0; j < dayOfWeek(year, month, i); j++){
                        System.out.print("   ");
                    }
                }
                System.out.printf("%2d ", i);
                if (dayOfWeek(year, month, i) == 6 || i == LeapDayMax[month - 1]) {
                    System.out.println();
                }
            }
        }
        else{
            for(int i = 1; i <= DayMax[month - 1]; i++){
                if (i == 1) {
                    for(int j = 0; j < dayOfWeek(year, month, i); j++){
                        System.out.print("   ");
                    }
                }
                System.out.printf("%2d ", i);
                if (dayOfWeek(year, month, i) == 6 || i == DayMax[month - 1]) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        int year = 0;
        int month = 0;

        for(int i = 0; i < args.length; i++){
            if (args[i].equals("-y") || args[i].equals("--year")) {
                year = Integer.parseInt(args[++i]);
            }

            if (args[i].equals("-m") || args[i].equals("--month")) {
                month = Integer.parseInt(args[++i]);
            }
        }

        if (year == 0 && month == 0) {
            GregorianCalendar today = new GregorianCalendar();
            year = today.get(YEAR);
            month = today.get(MONTH) + 1;
            printCalender(year, month);
            System.out.println();
        }
        else if (month == 0) {
            for(int i = 1; i <= 12; i++){
                printCalender(year, i);
                System.out.println();
            }
        }
        else{
            printCalender(year, month);
            System.out.println();
        }
    }
}
