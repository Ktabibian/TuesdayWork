package accounting;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(0.00);

        account.setBalance(-3.00);

        System.out.println(account.getBalance());
    }
}
