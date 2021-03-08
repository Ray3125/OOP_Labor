package labor4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

int

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("Labor4/lab4_1_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        ArrayList<Customer> customers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] items = line.split(",");
            if (items[0].equals("Customer")) {
                customers.add(new Customer(items[1].trim(), items[2].trim()));
            }
//            else {
//                String accountNumber = items[1].trim();
//                double amount = Double.parseDouble(items[2].trim());
//                BankAccount account = new BankAccount(accountNumber);
//                account.deposit(amount);
//              //  Customer customer = customers.get(customers.size()-1);
//                customer.addAccount(account);
//            }
        }
    }
}