public class Period {
    private Day from;
    private Day to;

    Period(){ }
    Period(Day from){
        this.from = from;
    }
    Period(Day from, Day to){
        this(from);
        this.to = to;
    }

    Day getFrom(){
        return new Day(from);
    }

    Day getTo(){
        return new Day(to);
    }

    public String toString(){
        return String.format("開始日：%s\n" +
                             "終了日：%s", from, to);
    }
}
