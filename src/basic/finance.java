package basic;

class Finance {
    public class Customer {
        private String firstName;
        private String lastName;
        private Account account;
        private String[] userIDs = {"foo", "bar", "endGame", "GOT"};
        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public void addAccount(double initialBalance) {
            account = new Account();
            account.setAccountId(Account.getNextId());
            account.deposit(initialBalance);
            customerDetails();
        }
        private void customerDetails() {
            account.displayAccountDetails();
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        }
    }
    public static class Account {
        private double balance;
        private String accountId;
        private static int NEXTID = 0;
        public static final int ROUTING_NUMBER = 12345;
        public void deposit(double amount) {
            balance = balance + amount;
        }
        public void withdraw(double amount) {
            balance = balance - amount;
        }
        public void displayAccountDetails() {
            System.out.println("****** Account Information");
            System.out.println("ID: " + accountId);
            System.out.println("Balance: " + balance);
            System.out.println("Routing Number" + ROUTING_NUMBER);
        }
        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }
        private static String getNextId() {
            return "ACCT# " + Account.NEXTID++;
        }
    }
    public static class Bank {
        public static void main(String[] args) {
            //Execute code
            Customer customer = new Customer("John", "Doe");
            customer.addAccount(500);
            Customer customer2 = new Customer("Foo", "Bar");
            customer2.addAccount(200);
        }
    }























}
