package insurance;

import account.Account;

import java.util.Date;

public class ResidenceInsurance extends Insurance{

    private static final double rate = 1.60;

    public ResidenceInsurance(Account account) {
        super(account, "Residence Insurance", rate);
    }
}
