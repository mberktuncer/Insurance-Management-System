package manage;

import account.Account;

import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accounts;

    public AccountManager(TreeSet<Account> accounts) {
        this.accounts = accounts;
    }

    public Account login(){
        return null;
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(TreeSet<Account> accounts) {
        this.accounts = accounts;
    }
}
