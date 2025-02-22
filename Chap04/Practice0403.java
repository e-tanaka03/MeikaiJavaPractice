import java.util.Scanner;

public class Practice0403 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A：");
        int a = stdIn.nextInt();

        System.out.print("整数B：");
        int b = stdIn.nextInt();
        
        int max, min;

        if (a > b) {
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }

        do{
            System.out.print( (min++) + "　");
        }while(min <= max);

        System.out.println();
    }
}
