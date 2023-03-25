package entities;

import java.util.Objects;

public class Account {
    private String accountNumber;
    private String accountName;
    private double accountBalance;
    private final double interest = 0.035;

    public Account(String accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public Account(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = 50;
    }

    public Account() {}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public void withDraw (double amount){
        if(accountBalance >= amount){
            this.accountBalance -= amount;
            System.out.println("Rut thanh cong "+ amount);
            System.out.println("So du: "+ this.accountBalance);
        }
        else {
            System.out.println("Số tiền không đủ");
        }
    }

    public void recharge(double amount){
        this.accountBalance += amount;
    }

    public void expire(){
        this.accountBalance = this.accountBalance + this.accountBalance*interest;
    }

    public void banking(Account destinationAccount, double amount){
        if(amount > this.accountBalance){
            System.out.println("so tien khong du");
        }
        else {
            this.accountBalance -= amount;
            destinationAccount.accountBalance += amount;
            System.out.println("Giao dich thanh cong");
        }
    }
}
