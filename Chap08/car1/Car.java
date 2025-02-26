public class Car {
    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double fuel;

    // 追加フィールド
    private String numberplate;
    private double tank;

    Car(String name, int width, int height, int length, double fuel){
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.fuel = fuel;
        x = y = 0.0;
    }

    double getX(){
        return x;
    }
    
    double getY(){
        return y;
    }

    double getFuel(){
        return fuel;
    }

    void putSpec(){
        System.out.println("名前 : " + name);
        System.out.println("車幅 : " + width + "mm");
        System.out.println("車高 : " + height + "mm");
        System.out.println("車長 : " + length + "mm");
    }

    boolean move(double dx, double dy){
        double dist = Math.sqrt(dx * dx + dy * dy);

        if (dist > fuel) {
            return false;
        }
        else{
            fuel -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }

    // 追加メソッド
    String getNumberPlate(){
        return numberplate;
    }

    void setNumberPlate(String numberplate){
        this.numberplate = numberplate;
    }
    
    double getTank(){
        return tank;
    }

    void setTank(double tank){
        this.tank = tank;
    }

    void refueling(double gasoline){
        this.fuel += gasoline;
    }

    double amountOfrefuelable(){
        return tank - fuel;
    }
}