package shape3;

public class IsoscelesTriangleRU extends IsoscelesTriangle{
    public IsoscelesTriangleRU(int step){
        super(step);
    }

    public String toString(){
        return "IsoscelesTriangleRU(step:" + getStep() + ")";
    }

    public void draw(){
        for(int i = 0; i < getStep(); i++){
            int k = 0;
            for(int j = 0; j < i; j++){
                System.out.print(' ');
                k++;
            }
            for(int j = getStep() - k; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
