package test;

import entities.Account;
import entities.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("12345", "quangtrieu", 50.0, "12345");
        Account account2 = new Account("22222", "ngocle", 60.0, "12345");
        Account account3 = new Account("56789", "leuleuleu", 70.0, "12345");
        Bank bank = new Bank();

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.showAccount();

        Scanner sc = new Scanner(System.in);

        int choose = 0;
        do{
            System.out.println("ATM application");
            System.out.println("1. Đăng nhập");
            System.out.println("3. Danh sách tài khoản");
            choose = sc.nextInt();
            switch (choose){
                case 1: {
                    sc.nextLine();
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập mật khẩu");
                    String pass = sc.nextLine();
                    Account accountLogin = bank.login(name, pass);
                    while (accountLogin == null){
                        System.out.println("Nhập lại mật khẩu: ");
                        String rePass = sc.nextLine();
                        accountLogin = bank.login(name, rePass);
                    }
                    System.out.println("1. Rút tiền");
                    System.out.println("2. Chuyển tiền");
                    System.out.println("3. Gửi tiền");
                    String type = sc.nextLine();
                    switch (type){
                        case "1": {
                            if(accountLogin != null){
                                System.out.println("Nhập số tiền: ");
                                double amount = sc.nextDouble();
                                while (accountLogin.getAccountBalance() <= amount){
                                    System.out.println("Tài khoản không đủ, nhập lại số tiền muốn rút: ");
                                    amount = sc.nextDouble();
                                }
                                accountLogin.withDraw(amount);
                            }
                            else{
                                System.out.println("Bạn chưa đăng nhập");
                            }
                            break;
                        }
                        case "2": {
                            if(accountLogin == null){
                                System.out.println("Bạn chưa đăng nhập");
                            }
                            else {
                                System.out.println("Nhập số tiền: ");
                                double amount = sc.nextDouble();
                                while (accountLogin.getAccountBalance() <= amount){
                                    System.out.println("Nhập lại số tiền");
                                    amount = sc.nextDouble();
                                }
                                System.out.println("Nhập Số TK muốn chuyển: ");
                                sc.nextLine();
                                String accountNumberDes = sc.nextLine();
                                Account desAccount = bank.findAccount(accountNumberDes);
                                accountLogin.banking(desAccount, amount);
                            }
                            break;
                        }
                        case "3": {
                            break;
                        }
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