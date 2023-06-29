package Test.CoreJava;

public class BackAccount {
    public BackAccount(int phoneNumber, String customerName, String email) {
        this(phoneNumber, customerName, email, 456,100);
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    private int accountNumber, balance, phoneNumber;
    private String customerName, email;

    public BackAccount() {
        this(9158 , "test", "abc@gmail.com" , 789, 200);
        System.out.println("This is a construtor");
    }

    public BackAccount(int phoneNumber, String customerName, String  email, int accountNumber, int balance ) {

        System.out.println("Back account with constructor with parameters");
        this.customerName = customerName;
        this.email = email;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositFunds(int depositAmount) {
        this.balance += depositAmount;
        System.out.println("Balance " + this.balance);
    }

    public void withdrawFunds(int withdrawAmount) {

        if (this.balance - withdrawAmount <= 0) {
            System.out.println("Insufficient balance");
        }else {
            this.balance -= withdrawAmount;
            System.out.println("withdraw of" + withdrawAmount + " remaining balance" + this.balance);
        }
    }

}
