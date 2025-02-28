package human;

/**
 * クラスHumanは、人を表すクラスです。
 * @author Eita Tanaka
 */
public class Human {
    /**
     * 人の名前を表すString型のフィールドです。
     */
    private String name;
    /**
     * 人の身長を表すdouble型のフィールドです。
     */
    private double hight;
    /**
     * 人の体重を表すdouble型のフィールドです。
     */
    private double weight;
    /**
     * 人の誕生日を表すDay型のフィールドです。
     */
    private Day birthDay;

    /**
     * 人を生成するコンストラクタです。
     * 名前、身長、体重を引数として受け取ります。
     * @param name
     * @param hight
     * @param weight
     */
    Human(String name, double hight, double weight){
        this.name = name;
        this.hight = hight;
        this.weight = weight;
    }

    /**
     * 人を生成するコンストラクタです。
     * 名前、身長、体重、誕生日を引数として受け取ります。
     * @param name
     * @param hight
     * @param weight
     * @param birthDay
     */
    Human(String name, double hight, double weight, Day birthDay){
        this(name, hight, weight);
        this.birthDay = birthDay;
    }

    /**
     * 人の名前を取得します。
     * @return 人の名前。
     */
    String getName(){
        return name;
    }

    /**
     * 人の身長を取得します。
     * @return 人の身長。
     */
    double getHight(){
        return hight;
    }

    /**
     * 人の体重を取得します。
     * @return 人の体重。
     */
    double getWeight(){
        return weight;
    }

    /**
     * 人の名前を設定します。
     * @param name 設定する人の名前。
     */
    void setName(String name){
        this.name = name;
    }

    /**
     * 人の身長を設定します。
     * @param hight 設定する人の身長。
     */
    void setHight(double hight){
        this.hight = hight;
    }

    /**
     * 人の体重を設定します。
     * @param weight 設定する人の体重。
     */
    void setWeight(double weight){
        this.weight = weight;
    }

    /**
     * 人の誕生日を取得します。
     * @return 人の誕生日。
     */
    Day getBirthDay(){
        return new Day(birthDay);
    }

    /**
     * メソッドputSpecは、人に関する情報を表す文字列を出力します。
     */
    void putSpec(){
        System.out.println("名前：" + name);
        System.out.println("身長：" + hight + "cm");
        System.out.println("体重：" + weight + "kg");
    }

    /**
     * メソッドtoStringは、人に関する情報を表す文字列を返却します。
     * @return 文字列"　名前：明解太郎
     * 　　　　　　　　　身長：175.5
     * 　　　　　　　　　体重：72.5
     * 　　　　　　　　誕生日：1999年02月15日(木)"
     * 　　　　　明解太郎、175.5、72.5、1999年02月15日(木)の部分はそれぞれの値に応じた値です。
     */
    public String toString(){
        return String.format("　名前：%s\n" +
                             "　身長：%4.1f\n" +
                             "　体重：%4.1f\n" +
                             "誕生日：%s", name, hight, weight, birthDay); 
    }
}