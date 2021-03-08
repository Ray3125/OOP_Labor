package labor3_1;

public class Customer {

    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }

    public void setAccount(BankAccount account) {
        if (account != null) {
            this.account = account;
        }
    }

    public void closeAccount (BankAccount account) {
        if (account != null) {
            this.account = null;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
