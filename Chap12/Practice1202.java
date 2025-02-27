import account.*;

public class Practice1202 {
    public static void main(String[] args) {
        Account a = new Account("a", "123", 5000);
        TimeAccount b = new TimeAccount("b", "456", 3000, 1000);

        System.out.println(TimeAccount.compBalance(a, b));
    }
}
