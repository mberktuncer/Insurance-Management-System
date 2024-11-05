package insurance;

import account.Account;

public class TravelInsurance extends Insurance{
    private static final double rate = 1.10;
    public TravelInsurance(Account account) {
        super(account, "Travel Insurance", rate);
    }
}
