import java.util.Scanner;

public class Practice0309 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();

        if(a > b){
            System.out.println("大きいほうの値は" + a + "です。");
        }
        else{
            System.out.println("大きいほうの値は" + b + "です。");
        }
    }
}
