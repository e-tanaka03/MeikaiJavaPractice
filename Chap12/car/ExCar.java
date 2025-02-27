package car;

import day.Day;

public class ExCar extends Car {
    private int totalMile;

    public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay, int totalMile){
        super(name, width, height, length, fuel, purchaseDay);
        this.totalMile = totalMile;
    }

    public int getTotalMile(){
        return totalMile;
    }

    public void putSpec(){
        super.putSpec();
        System.out.println("総走行距離：" + totalMile + "km");
    }

    public boolean move(double dx, double dy){
        double dist = Math.sqrt(dx * dx + dy * dy);

        if (dist > super.fuel) {
            return false;
        }
        else{
            super.fuel -= dist;
            super.x += dx;
            super.y += dy;
            totalMile += dist;
            return true;
        }
    }
}
