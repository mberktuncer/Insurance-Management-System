import manage.AccountManager;
import account.Account;
import manage.InsuranceManager;
import manage.AddressManager;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        program:
        while (true) {
            System.out.print("""
                                        
                    ----------Insurance Interface---------
                    1-LogIn
                    2-Create Account
                    Q-Exit Program
                    --------------------------------------
                    Enter:\s""");

            String preference = scanner.nextLine();

            switch (preference) {
                case "1" -> logInMenu();
                case "2" -> createAccount();
                case "q" -> {
                    break program;
                }
                default -> System.out.println("Enter Valid Value!");
            }
        }
    }

    public static void logInMenu() {
        if (AccountManager.login()) {
            accountMenu(AccountManager.getLoggedinAccount());
        }
        else run();
    }

    public static void createAccount() {
        AccountManager.createAccount();
        run();
    }

    public static void accountMenu(Account account) {
        Scanner scanner = new Scanner(System.in);
        accountMenuLabel:
        while (true) {
            System.out.print("""
                                        
                    -------------Account Menu-------------
                    1-Insurance Transactions
                    2-Address Operations
                    3-Show Person's Information
                    Q-Exit
                    --------------------------------------
                    Enter:\s""");

            String preference = scanner.nextLine().toLowerCase();

            switch (preference) {
                case "1" -> insuranceMenu(account);
                case "2" -> addressMenu(account);
                case "3" -> account.showUserInfo();
                case "q" -> {
                    AccountManager.setNullLoggedIntAccount();
                    break accountMenuLabel;
                }
                default -> System.out.println("Enter Valid Value!");
            }
        }
    }

    public static void insuranceMenu(Account account) {
        Scanner scanner = new Scanner(System.in);
        insuranceMenuLabel:
        while (true) {
            System.out.print("""
                                        
                    ------------Insurance Menu------------
                    1-Show Insurances
                    2-Add Insurance
                    Q-Back to Menu
                    --------------------------------------
                    Enter:\s""");

            String preference = scanner.nextLine().toLowerCase();

            switch (preference) {
                case "1" -> InsuranceManager.printInsurances(account);
                case "2" -> InsuranceManager.addInsurance(account);
                case "q" -> {
                    break insuranceMenuLabel;
                }
                default -> System.out.println("Enter Valid Value!");

            }
        }
    }

    public static void addressMenu(Account account) {
        Scanner scanner = new Scanner(System.in);
        addressMenuLabel:
        while (true) {
            System.out.print("""
                                        
                    -------------Address Menu-------------
                    1-Show Addresses
                    2-Add Address
                    3-Remove Address
                    Q-Back to Menu
                    --------------------------------------
                    """);

            String preference = scanner.nextLine().toLowerCase();

            switch (preference) {
                case "1" -> AddressManager.printAddresses(account.getUser().getAddresses());
                case "2" -> AddressManager.addAddress(account.getUser().getAddresses());
                case "3" -> AddressManager.removeAddress(account.getUser().getAddresses());
                case "q" -> {
                    break addressMenuLabel;
                }
                default -> System.out.println("Enter Valid Value!");
            }
        }
    }
}