package account;

import insurance.Insurance;
import user.User;

import java.util.ArrayList;

public class EnterpriseAccount extends Account{
    public EnterpriseAccount(User user, ArrayList<Insurance> accounts, AuthenticationStatus authenticationStatus) {
        super(user, accounts, authenticationStatus);
    }

    @Override
    public void showUserInfo() {

    }
}
