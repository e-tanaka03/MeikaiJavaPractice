public class Practice0902 {
    public static void main(String[] args) {
        Day d1 = new Day();
        Day d2 = new Day(1999);
        Day d3 = new Day(2000, 12);
        Day d4 = new Day(2002, 5, 23);
        Day d5 = new Day(d4);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}
