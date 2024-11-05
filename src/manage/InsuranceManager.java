package manage;

import account.Account;
import insurance.*;

import java.util.Comparator;
import java.util.Scanner;

public class InsuranceManager {

    public static void addInsurance(Account account) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1-Car Insurance
                2-Health Insurance
                3-Residence Insurance
                4-Travel Insurance
                Enter:\s""");

        int preference = scanner.nextInt();

        switch (preference) {
            case 1 -> account.getInsurances().add(new CarInsurance(account));
            case 2 -> account.getInsurances().add(new HealthInsurance(account));
            case 3 -> account.getInsurances().add(new ResidenceInsurance(account));
            case 4 -> account.getInsurances().add(new TravelInsurance(account));
        }

        account.getInsurances().sort(Comparator.comparing(Insurance::getType));
    }

    public static void printInsurances(Account account) {
        for (Insurance insurance : account.getInsurances()) {
            System.out.println(insurance.toString());
        }
    }

}
