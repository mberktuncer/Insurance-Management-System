package account;

import insurance.Insurance;
import user.User;

import java.util.ArrayList;

public abstract class Account {

    public enum AuthenticationStatus{
        SUCCESS,
        FAIL
    }
    private User user;
    private ArrayList<Insurance> accounts;
    private AuthenticationStatus authenticationStatus;

    public Account(User user, ArrayList<Insurance> accounts, AuthenticationStatus authenticationStatus) {
        this.user = user;
        this.accounts = accounts;
        this.authenticationStatus = authenticationStatus;
    }

    public abstract void showUserInfo();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Insurance> accounts) {
        this.accounts = accounts;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }
}
