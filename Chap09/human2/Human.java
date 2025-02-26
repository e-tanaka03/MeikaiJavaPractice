public class Human {
    private String name;
    private double hight;
    private double weight;
    private Day birthDay;

    Human(String name, double hight, double weight){
        this.name = name;
        this.hight = hight;
        this.weight = weight;
    }
    Human(String name, double hight, double weight, Day birthDay){
        this(name, hight, weight);
        this.birthDay = birthDay;
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

    Day getBirthDay(){
        return new Day(birthDay);
    }

    void putSpec(){
        System.out.println("名前：" + name);
        System.out.println("身長：" + hight + "cm");
        System.out.println("体重：" + weight + "kg");
    }

    public String toString(){
        return String.format("　名前：%s\n" +
                             "　身長：%4.1f\n" +
                             "　体重：%4.1f\n" +
                             "誕生日：%s", name, hight, weight, birthDay); 
    }
}