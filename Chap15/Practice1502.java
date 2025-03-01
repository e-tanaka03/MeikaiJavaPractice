import java.util.Scanner;

public class Practice1502 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列s : ");
        String s = stdIn.nextLine();

        for(int i = 0; i < s.length(); i++){
            System.out.printf("s[%d] = 0x%x\n", i, s.codePointAt(i));
        }
    }
}
