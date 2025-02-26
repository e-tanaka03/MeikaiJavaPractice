import java.util.Scanner;

public class Practice0730 {
    static int min(int a, int b){
        if(a > b){
            return b;
        }
        else{
            return a;
        }
    }

    static int min(int a, int b, int c){
        int min = a;
        if(min > b){
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    static int min(int[] a){
        int min = a[0];

        for(int i = 0; i < a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("整数a : ");
        int a = stdIn.nextInt();
        System.out.print("整数b : ");
        int b = stdIn.nextInt();
        
        System.out.println("aとbの小さいほうは" + min(a, b) + "です。");
        
        System.out.print("整数c : ");
        int c = stdIn.nextInt();
        
        System.out.println("aとbとcの最小値は" + min(a, b, c) + "です。");

        System.out.print("配列xの要素数 : ");
        int n = stdIn.nextInt();

        int[] x = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("配列xの要素の最小値は" + min(x) + "です。");
    }
}