package player;

public class HumanPlayer extends Player{
    public HumanPlayer(int hand){
        setHand(hand);
    }

    public String toString(){
        return "あなたの手は" + handString[getHand()] + "です。";
    }
}
