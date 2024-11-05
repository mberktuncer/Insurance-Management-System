package account;

import user.User;

public class IndividualAccount extends Account{
    public static final double rate = 1.10;

    public IndividualAccount(User user) {
        super(user, rate);
    }
}
