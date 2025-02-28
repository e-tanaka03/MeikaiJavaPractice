package shape2;

public class IsoscelesTriangleLU extends IsoscelesTriangle {
    public IsoscelesTriangleLU(int step){
        super(step);
    }

    public String toString(){
        return "IsoscelesTriangleLU(step:" + getStep() + ")";
    }

    public void draw(){
        for(int i = getStep(); i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
