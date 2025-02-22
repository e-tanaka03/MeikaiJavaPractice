import java.util.Random;

public class Practice0317 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int hand = rand.nextInt(3);

        switch (hand) {
            case 0:
                System.out.println("グー");
                break;
            
            case 1:
                System.out.println("チョキ");
                break;
            
            case 2:
                System.out.println("パー");
                break;
        
            default:
                break;
        }
    }
}
