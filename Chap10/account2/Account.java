public class Account {
    private String name;
    private String no;
    private long balance;
    private Day openingDay;
    
    {
        System.out.println("明解銀行での口座開設ありがとうございます。");
    }
    
    Account(String name, String no, long balance, Day openingDay){
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openingDay = openingDay;
    }


    String getName(){
        return name;
    }

    String getNo(){
        return no;
    }

    long getBalance(){
        return balance;
    }

    void deposit(long k){
        balance += k;
    }

    void withdraw(long k){
        balance -= k;
    }

    Day getOpeningDay(){
        return new Day(openingDay);
    }
    
    public String toString(){
        return String.format("　口座名義：%s\n" + 
                             "　口座番号：%s\n" +
                             "　預金残高：%d\n" +
                             "口座開設日：%s", name, no, balance, openingDay);
    }
}
