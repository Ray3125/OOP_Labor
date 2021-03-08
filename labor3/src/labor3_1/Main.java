package labor3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Matyas", "Rajmond");
        System.out.println(customer1.toString());
        customer1.setAccount(new BankAccount("OTP2"));
        System.out.println(customer1.toString());
        customer1.closeAccount(new BankAccount("OTP2"));
        System.out.println(customer1.toString());
        Customer customer2 = new Customer("John", "Black");
        System.out.println(customer2.toString());
        customer2.setAccount(new BankAccount("OTP00001"));
        customer2.getAccount().deposit(1000);
        System.out.println(customer2.toString());
        Customer customer3 = new Customer("Mary", "WHITE");
        customer3.setAccount(new BankAccount("OTP00002"));
        customer3.getAccount().deposit(1000);
        customer3.setLastName("Black");
        customer3.setAccount(customer2.getAccount());
        System.out.println(customer2);
        System.out.println(customer3);
    }
}
