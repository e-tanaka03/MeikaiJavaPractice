package player;

import java.util.Random;

public class CPUPlayer extends Player{
    Random rand = new Random();
    
    public CPUPlayer(){
        setHand(rand.nextInt(3));
    }

    public void setCPUHand(){
        setHand(rand.nextInt(3));
    }

    public String toString(){
        return "コンピュータの手は" + handString[getHand()] + "です。";
    }
}
