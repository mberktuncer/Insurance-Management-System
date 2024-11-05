package manage;

import account.Account;
import account.EnterpriseAccount;
import account.IndividualAccount;
import user.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {

    private static final TreeSet<Account> accounts = new TreeSet<>();
    private static Account loggedinAccount = null;
    public static boolean login(){
        Scanner scanner = new Scanner(System.in);
        String email;
        String password;

        do {
            System.out.println("------------Log In------------");
            System.out.print("E-Mail: ");
            email = scanner.nextLine();
            if (email.equals("q") || email.equals("Q")) return false;
            System.out.print("Password: ");
            password = scanner.nextLine();
            if (password.equals("q") || password.equals("Q")) return false;
        } while (!(isLoggedIn(email, password)));

        return true;
    }

    public static Account getLoggedinAccount() {
        return loggedinAccount;
    }

    private static boolean isLoggedIn(String email, String password) {

        for (Account account : accounts) {
            if (account.getUser().getEmail().equals(email)) {
                if (account.getUser().getPassword().equals(password)) {
                    account.getUser().setLastLoginDate(getDate());
                    System.out.println("You Logged In!");
                    return true;
                }
            }
        }
        System.out.println("Email or Password Incorrect!");
        return false;

    }

    public static void createAccount(){
        Scanner scanner = new Scanner(System.in);
        String name;
        String surName;
        String email;
        String password;
        String job;
        int age;

        createAccountLabel:
        while (true) {
            System.out.print("""
                                    
                    -------------Account Type-------------
                    1-Individual
                    2-Enterprise
                    --------------------------------------
                    Enter Number:\s""");

            int accountTypeNum = scanner.nextInt();
            scanner.nextLine();

            System.out.print("E-Mail: ");
            email = scanner.nextLine();

            for (Account account : accounts) {
                if (account.getUser().getEmail().equals(email)) {
                    System.out.println("This Account Already Exists!!!");
                    continue createAccountLabel;
                }
            }

            System.out.print("Password: ");
            password = scanner.nextLine();

            System.out.print("Name: ");
            name = scanner.nextLine();

            System.out.print("Surname: ");
            surName = scanner.nextLine();

            System.out.print("Job: ");
            job = scanner.nextLine();

            System.out.print("Age: ");
            age = scanner.nextInt();


            switch (accountTypeNum) {
                case 1 -> accounts.add(new IndividualAccount(new User(name, surName, email, password, job, age, getDate())));
                case 2 -> accounts.add(new EnterpriseAccount(new User(name, surName, email, password, job, age, getDate())));
            }

            System.out.println("New Account Have Created!");
            break;
        }
    }

    private static String getDate() {

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return date.format(formatter);

    }

    public static void setNullLoggedIntAccount() {
        loggedinAccount = null;
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

}
