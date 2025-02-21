import java.util.Scanner;

public class Practice0310 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();

        if(a > b){
            System.out.println("2つの値の差は" + (a - b) + "です。");
        }
        else{
            System.out.println("2つの値の差は" + (b - a) + "です。");
        }
    }
}
