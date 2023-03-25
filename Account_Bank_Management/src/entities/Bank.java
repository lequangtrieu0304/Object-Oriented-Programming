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
        if (this.accounts.size() == 0) {
            System.out.println("EMPTY");
            return null;
        }
        Account findAccount = this.accounts
                .stream()
                .filter(account -> account.getAccountNumber().equals(type))
                .findFirst()
                .orElse(null);
        if(findAccount != null){
            return findAccount;
        }
        else {
            return null;
        }
    }
    public void showAccount(){
        this.accounts.forEach(account -> System.out.println(account.toString()));
    }
}
