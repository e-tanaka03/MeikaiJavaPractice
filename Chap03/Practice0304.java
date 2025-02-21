import java.util.Scanner;

public class Practice0304 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A:");
        int a = stdIn.nextInt();
        System.out.print("整数B:");
        int b = stdIn.nextInt();

        if(a > b){
            System.out.println("aのほうが大きいです。");
        }
        else if (a < b) {
            System.out.println("bのほうが大きいです。");
        }
        else{
            System.out.println("aとbは同じ値です。");
        }
    }
}
