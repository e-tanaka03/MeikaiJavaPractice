package shape2;

public class IsoscelesTriangleLB extends IsoscelesTriangle{
    public IsoscelesTriangleLB(int step){
        super(step);
    }

    public String toString(){
        return "IsoscelesTriangleLB(step:" + getStep() + ")";
    }

    public void draw(){
        for(int i = 1; i <= getStep(); i++){
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
