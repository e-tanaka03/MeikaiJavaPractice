public class Practice0901 {
    public static void main(String[] args) {
        Human[] x = { new Human("Meikai Ichiro", 168.2, 54.5),
                      new Human("Meikai Jiro", 174.3, 68.6)};

        Human[] y = new Human[2];
        y[0] = new Human("Atokara Saburo", 172.4, 65.2);
        y[1] = new Human("Atokara Shiro", 180.6, 77.6);

        x[0].putSpec();
        System.out.println();
        x[1].putSpec();
        System.out.println();
        y[0].putSpec();
        System.out.println();
        y[1].putSpec();
    }
}
