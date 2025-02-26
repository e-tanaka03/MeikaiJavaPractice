public class Human {
    private String name;
    private double hight;
    private double weight;

    Human(String name, double hight, double weight){
        this.name = name;
        this.hight = hight;
        this.weight = weight;
    }

    String getName(){
        return name;
    }

    double getHight(){
        return hight;
    }

    double getWeight(){
        return weight;
    }

    void setName(String name){
        this.name = name;
    }

    void setHight(double hight){
        this.hight = hight;
    }

    void setWeight(double weight){
        this.weight = weight;
    }

    void putSpec(){
        System.out.println("名前：" + name);
        System.out.println("身長：" + hight + "cm");
        System.out.println("体重：" + weight + "kg");
    }
}