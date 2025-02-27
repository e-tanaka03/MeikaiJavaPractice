import car.ExCar;
import day.Day;

public class Practice1201 {
    public static void main(String[] args) {
        ExCar car = new ExCar("ビッツ", 2000, 2000, 5000, 3000, new Day(2005, 7, 3), 0);

        car.putSpec();
    }
}
