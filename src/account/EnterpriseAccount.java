package account;

import user.User;

public class EnterpriseAccount extends Account{
    public static final double rate = 1.50;

    public EnterpriseAccount(User user) {
        super(user, rate);
    }
}
