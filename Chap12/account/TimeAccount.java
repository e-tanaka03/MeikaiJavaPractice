package account;

public class TimeAccount extends Account {
    private long timeBalance;

    public TimeAccount(String name, String no, long balance, long timeBalance){
        super(name, no, timeBalance);
        this.timeBalance = timeBalance;
    }

    public long getTimeBalace(){
        return timeBalance;
    }

    public void cancel(){
        deposit(timeBalance);
        timeBalance = 0;
    }

    public static int compBalance(Account a, Account b){
        long a_allBalance = a.getBalance();
        long b_allBalance = b.getBalance();

        if (a instanceof TimeAccount) {
            a_allBalance += ((TimeAccount)a).getTimeBalace();
        }
        if (b instanceof TimeAccount) {
            b_allBalance += ((TimeAccount)b).getTimeBalace();
        }

        if (a_allBalance > b_allBalance) {
            return 1;
        }
        else if (a_allBalance < b_allBalance) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
