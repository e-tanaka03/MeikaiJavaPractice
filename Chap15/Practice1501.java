import java.util.Scanner;

public class Practice1501 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列s : ");
        String s = stdIn.nextLine();

        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
