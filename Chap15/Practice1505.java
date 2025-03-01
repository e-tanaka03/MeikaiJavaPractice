import java.util.Scanner;
import player.*;

public class Practice1505 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] hands = {"グー", "チョキ", "パー"};
        int retry;

        do {
            CPUPlayer cpu1 = new CPUPlayer();
            CPUPlayer cpu2 = new CPUPlayer();

            int hand;
            do {
                System.out.print("じゃんけんポン");
                for(int i = 0; i < 3; i++){
                    System.out.printf("(%d)%s ", i, hands[i]);
                }
                System.out.print(" : ");
                hand = stdIn.nextInt();
            } while (hand < 0 || hand > 2);

            HumanPlayer user = new HumanPlayer(hand);
            System.out.println("コンピュータ１は" + hands[cpu1.getHand()] + "で、コンピュータ２は" + hands[cpu2.getHand()] + "で、あなたは" + hands[user.getHand()] + "です。");

            int judge = (cpu1.getHand() + cpu2.getHand() + user.getHand()) % 3;

            if (judge == 0) {
                System.out.println("引き分けです。");
            }
            else if (judge == 1) {
                if (cpu1.getHand() == cpu2.getHand()) {
                    System.out.println("あなたの負けです。");
                }
                else if (cpu1.getHand() == user.getHand()) {
                    System.out.println("あなたとコンピュータ１の勝ちです。");
                }
                else{
                    System.out.println("あなたとコンピュータ２の勝ちです。");
                }
            }
            else{
                if (cpu1.getHand() == cpu2.getHand()) {
                    System.out.println("あなたの勝ちです。");
                }
                else if (cpu1.getHand() == user.getHand()) {
                    System.out.println("あなたの負けです。");
                }
                else{
                    System.out.println("あなたの負けです。");
                }
            }

            do {
                System.out.print("もう一度？ (0)いいえ (1)はい : ");
                retry = stdIn.nextInt();
            } while (retry != 0 && retry != 1);
            
        } while (retry == 1);
    }
}
