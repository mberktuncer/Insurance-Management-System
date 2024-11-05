package account;

import insurance.Insurance;
import user.User;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{

    private final double rate;
    private User user;
    private final ArrayList<Insurance> insurances;

    public enum AuthenticationStatus{
        SUCCESS,
        FAIL
    }

    public Account(User user, double rate) {
        this.user = user;
        this.insurances = new ArrayList<>();
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public  void showUserInfo(){
        System.out.println(user.toString());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }
    @Override
    public int compareTo(Account account) {
        return this.user.getEmail().compareTo(account.user.getEmail());
    }

}
