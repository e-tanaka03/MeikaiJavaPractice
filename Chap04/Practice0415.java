import java.util.Scanner;

public class Practice0415 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何cmから：");
        int start = stdIn.nextInt();
        System.out.print("何cmまで：");
        int end = stdIn.nextInt();
        System.out.print("何cmごと：");
        int interval = stdIn.nextInt();

        System.out.println("身長　標準体重");
        for(int i = start; i <= end; i += interval){
            double weight = (i - 100) * 0.9;
            if(((weight * 10) % 10) == 0){
                System.out.println(i + "　" + (int)weight);
            }
            else{
                System.out.println(i + "　" + weight);
            }
        }
    }
}
