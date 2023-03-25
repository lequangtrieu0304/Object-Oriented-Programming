package test;

import entities.Account;
import entities.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("12345", "quangtrieu", 50.0);
        Account account2 = new Account("22222", "ngocle", 60.0);
        Account account3 = new Account("56789", "chichnhau", 70.0);
        Bank bank = new Bank();

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.showAccount();

        Scanner sc = new Scanner(System.in);

        int choose = 0;
        do{
            System.out.println("ATM application");
            System.out.println("1. RUT TIEN");
            System.out.println("2. CHUYEN TIEN");
            System.out.println("3. HIEN THI HET TK");
            choose = sc.nextInt();
            switch (choose){
                case 1: {
                    sc.nextLine();
                    System.out.println("Nhap STK: ");
                    String accountNumber = sc.nextLine();
                    Account account = bank.findAccount(accountNumber);
                    if(account == null){
                        System.out.println("NOT FOUND ACCOUNT");
                    }
                    else {
                        System.out.println("Nhap ST: ");
                        double amount = sc.nextDouble();
                        account.withDraw(amount);
                    }
                    break;
                }
                case 2: {
                    sc.nextLine();
                    System.out.println("Nhap STK: ");
                    String accountNumber = sc.nextLine();
                    Account account = bank.findAccount(accountNumber);
                    if(account == null){
                        System.out.println("NOT FOUND ACCOUNT");
                    }
                    else {
                        System.out.println("Nhap ST: ");
                        double amount = sc.nextDouble();
                        System.out.println("Nhap STK muon chuyen: ");
                        sc.nextLine();
                        String accountNumberDes = sc.nextLine();
                        Account desAccount = bank.findAccount(accountNumberDes);
                        account.banking(desAccount, amount);
                    }
                    break;
                }
                case 3: {
                    bank.showAccount();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }while (choose != 0);
    }
}