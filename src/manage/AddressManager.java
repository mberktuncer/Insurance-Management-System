package manage;

import address.Address;
import address.BusinessAddress;
import address.HomeAddress;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class AddressManager {

    public static void addAddress(ArrayList<Address> addresses) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String address;
        int preference;

        System.out.print("""
                1-Home Address
                2-Business Address
                Enter Number:\s""");

        preference = scanner.nextInt();

        System.out.print("Enter Address Name: ");
        name = scanner.nextLine();
        System.out.println("Enter Full Address:");
        address = scanner.nextLine();

        switch (preference) {
            case 1 -> addresses.add(new HomeAddress(name, address));
            case 2 -> addresses.add(new BusinessAddress(name, address));
        }
        reList(addresses);
    }

    public static void removeAddress(ArrayList<Address> addresses) {
        Scanner scanner = new Scanner(System.in);
        printAddresses(addresses);
        System.out.print("Enter Number or Press Q to Back: ");
        int addressIndex = scanner.nextInt();
        addresses.remove(addressIndex);
    }

    public static void printAddresses(ArrayList<Address> addresses) {
        int i = 0;
        System.out.println("------------------------Addresses------------------------");
        for (Address address : addresses)
            System.out.println((++i) + "-" + address.toString() +
                    "\n---------------------------------------------------------");
    }

    private static void reList(ArrayList<Address> addresses) {
        addresses.sort(Comparator.comparing(Address::getName));
    }

}
