import pet.*;

public class Practice1402 {
    public static void main(String[] args) {
        SkinnableRobotPet a = new SkinnableRobotPet("aaa", "bbb");

        a.introduce();
        a.changeSkin(Skinnable.BLACK);
    }
}
