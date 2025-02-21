import java.util.Scanner;

public class Practice0210 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("姓：");
        String s1 = stdIn.nextLine();
        
        System.out.print("名：");
        String s2 = stdIn.nextLine();
        
        System.out.println("こんにちは" + s1 + s2 + "さん。");
    }
}
