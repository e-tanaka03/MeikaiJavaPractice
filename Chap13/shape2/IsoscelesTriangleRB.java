package shape2;

public class IsoscelesTriangleRB extends IsoscelesTriangle{
    public IsoscelesTriangleRB(int step){
        super(step);
    }

    public String toString(){
        return "IsoscelesTriangleRB(step:" + getStep() + ")";
    }

    public void draw(){
        for(int i = getStep(); i > 0; i--){
            int k = 0;
            for(int j = i - 1; j > 0; j--){
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
