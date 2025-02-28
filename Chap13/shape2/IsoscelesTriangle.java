package shape2;

public abstract class IsoscelesTriangle extends Shape{
    private int step;

    public IsoscelesTriangle(int step){
        setStep(step);
    }

    public int getStep(){
        return step;
    }

    public void setStep(int step){
        this.step = step;
    }
}
