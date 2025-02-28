package player;


public abstract class Player {
    /**
     * プレーヤが出す手を表すint型のフィールド
     * 0･･･グー 1･･･チョキ 2･･･パー 
     */
    private int hand;

    protected String[] handString = {"グー", "チョキ", "パー"};

    public Player(){ }

    public int getHand(){
        return hand;
    }

    public void setHand(int hand){
        this.hand = hand;
    }

    public abstract String toString();

    /**
     * どちらのプレーヤが勝ったか判定するメソッド
     * @param a
     * @param b
     * @return -1･･･aの勝利 0･･･引き分け 1･･･bの勝ち
     */
    public static int judge(Player a, Player b){
        if (a.getHand() == 0) {
            switch (b.getHand()) {
                case 0:
                    return 0;
                
                case 1:
                    return -1;

                case 2:
                    return 1;
            
                default:
                    break;
            }
        }
        else if (a.getHand() == 1) {
            switch (b.getHand()) {
                case 0:
                    return 1;
            
                case 1:
                    return 0;

                case 2:
                    return -1;

                default:
                    break;
            }
        }
        else{
            switch (b.getHand()) {
                case 0:
                    return -1;
            
                case 1:
                    return 1;

                case 2:
                    return 0;
                
                default:
                    break;
            }
        }

        return 0;
    }

    public void print(Player a){
        System.out.println(toString());
        System.out.println(a.toString());

        int judge = judge(this, a);
        if (judge == -1) {
            System.out.println("あなたの勝ちです。");
        }
        else if (judge == 0) {
            System.out.println("引き分けです。");
        }
        else{
            System.out.println("あなたの負けです。");
        }
    }
}
