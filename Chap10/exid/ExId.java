public class ExId {
    static int counter = 0;
    private static int n = 1;
    private int id;

    public ExId(){
        counter += n;
        id = counter;
    }

    public int getId(){
        return id;
    }

    static int getMaxId(){
        return counter;
    }

    static void setN(int x){
        n = x;
    }
}