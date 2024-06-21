// Jorge Villarreal Soules

import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        // Constants for Tax and Tip Amount
        final double TAX_AMOUNT = 0.0675;
        final double TIP_AMOUNT = 0.20;

        Scanner scanner = new Scanner(System.in);

        // Prompts the User to Input their Restaurant Bill
        System.out.println("Enter Restaurant Bill: ");
        double restaurantBill = scanner.nextDouble();

        // Calculate Bill after Tax
        double tax = restaurantBill * TAX_AMOUNT;

        // Calculate Bill after Tip
        double tip = restaurantBill * TIP_AMOUNT;

        // Calculate Total Bill Amount
        double totalBillAmount = tax + tip + restaurantBill;

        // Displays All Amounts
        System.out.println("Restaurant Bill: " + restaurantBill);
        System.out.println("Total Tax Amount: " + tax);
        System.out.println("Total Tip Amount: " + tip);
        System.out.println("Total Bill Amount: " + totalBillAmount);

        scanner.close();
    }
}
