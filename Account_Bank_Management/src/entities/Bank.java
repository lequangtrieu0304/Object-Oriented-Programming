package entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    public Bank() {
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account acc) {
        Account accountExist = this.accounts
                .stream()
                .filter(account -> account.getAccountNumber().equals(acc.getAccountNumber()))
                .findFirst()
                .orElse(null);
        if(accountExist != null){
            System.out.println("ACCOUNT EXITS");
        }
        else {
            this.accounts.add(acc);
        }
    }
    public Account findAccount(String type){
        Account findAccount = this.accounts
                .stream()
                .filter(account -> account.getAccountNumber().equals(type))
                .findFirst()
                .orElse(null);
        if(findAccount != null) {
            return findAccount;
        }
        return null;
    }
    public Account login(String accountName, String password){
        Account accountLogin = this.accounts
                .stream()
                .filter(account -> account.getAccountName().equals(accountName))
                .findFirst()
                .orElse(null);
        if(accountLogin != null){
            if(accountLogin.getPassword().equals(password)){
                return accountLogin;
            }
            else {
                System.out.println("Mật khẩu không đúng");
            }
        }
        return null;
    }
    public void showAccount(){
        this.accounts.forEach(account -> System.out.println(account.toString()));
    }
}
