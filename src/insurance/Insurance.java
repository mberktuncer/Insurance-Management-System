package insurance;

import account.Account;

import java.util.Date;
import java.util.Scanner;

public abstract class Insurance {
    Account account;
    String name;
    String startDate;
    String endDate;
    String type;
    double price;
    double rate;

    Insurance(Account account, String type, double rate) {
        this.account = account;
        this.type = type;
        this.rate = rate;
        createInsurance();
    }

    public void createInsurance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Create New Insurance--------");

        System.out.print("Insurance Name: ");
        this.name = scanner.nextLine();
        System.out.print("Start Date: ");
        this.startDate = scanner.nextLine();
        System.out.print("End Date: ");
        this.endDate = scanner.nextLine();
        System.out.print("Price: ");
        this.price = scanner.nextDouble();
    }

    public double calculate() {
        return price * rate * account.getRate();
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Start Date: " + startDate + " End Date: " + endDate + " Total Price: " + calculate();
    }
}
