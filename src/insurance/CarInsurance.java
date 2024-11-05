package insurance;

import account.Account;

import java.util.Date;

public class CarInsurance extends Insurance{

    private static final double rate = 1.50;
    public CarInsurance(Account account) {
        super(account, "Car Insurance", rate);
    }
}
