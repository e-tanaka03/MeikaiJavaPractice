package account;

public class Account {
    protected String name;
    protected String no;
    protected long balance;
    
    public Account(String name, String no, long balance){
        this.name = name;
        this.no = no;
        this.balance = balance;
    }


    public String getName(){
        return name;
    }

    public String getNo(){
        return no;
    }

    public long getBalance(){
        return balance;
    }

    public void deposit(long k){
        balance += k;
    }

    public void withdraw(long k){
        balance -= k;
    }
    
    public String toString(){
        return String.format("　口座名義：%s\n" + 
                             "　口座番号：%s\n" +
                             "　預金残高：%d", name, no, balance);
    }
}
