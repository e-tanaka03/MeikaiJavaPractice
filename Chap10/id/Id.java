public class Id {
    static int counter = 0;

    private int id;

    public Id(){
        id = ++counter;
    }

    public int getId(){
        return id;
    }

    static int getMaxId(){
        return counter;
    }
}