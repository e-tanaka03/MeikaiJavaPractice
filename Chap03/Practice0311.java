import java.util.Scanner;

public class Practice0311 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A:");
        int a = stdIn.nextInt();
        System.out.print("整数B:");
        int b = stdIn.nextInt();

        int diff;
        if(a > b){
            diff = a - b;
        }
        else{
            diff = b - a;
        }
        
        if (diff < 11) {
            System.out.println("それらの差は10以下です。");
        }
        else{
            System.out.println("それらの差は11以上です。");
        }
    }
}
