import java.util.Scanner;

public class Practice0308 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("点数：");
        int point = stdIn.nextInt();
        
        if (point < 60) {
            System.out.println("不可");
        }
        else if ((60 <= point) && (point < 70) ) {
            System.out.println("可");
        }
        else if ((70 <= point) && (point < 80) ) {
            System.out.println("良");
        }
        else if ((80 <= point) && (point <= 100) ) {
            System.out.println("優");
        }

    }
}
