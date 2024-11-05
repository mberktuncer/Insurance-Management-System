package insurance;

import account.Account;

public class HealthInsurance extends Insurance{
    private static final double rate = 1.30;
    public HealthInsurance(Account account) {
        super(account, "Health Insurance", rate);
    }
}
