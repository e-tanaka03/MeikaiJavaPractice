import java.util.Scanner;
import player.*;

public class Practice1303 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int hand;
        do{
            System.out.print("あなたの手はなですか(0･･･グー／1･･･チョキ／2･･･パー) : ");
            hand = stdIn.nextInt();
        }while(!((0 <= hand) && (hand <= 2)));

        HumanPlayer human = new HumanPlayer(hand);
        CPUPlayer cpu = new CPUPlayer();

        cpu.setCPUHand();

        human.print(cpu);
    }
}
