package labor3_1;

public class BankAccount {
    //adattagok/attributumok
    private String accountNumber;
    private double balance; // egyenleg - mennyi pénzed van, >=0

    // inicializálja az adattagokat
    public BankAccount(String accountNumber){
        //shadowing - elfedes
        //accountNumber parameter - lokalis valtozo
        //accountNumber - attributum(adattag)
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            return;
        }
        this.balance += amount;

    }

    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

