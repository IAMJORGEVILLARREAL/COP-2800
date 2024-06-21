import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) { 

    // Constants for tax rates
    final double STATE_SALES_TAX = 0.04;
    final double COUNT_SALES_TAX = 0.02;
    final double TOTAL_SALES_TAX = STATE_SALES_TAX + COUNT_SALES_TAX;

     // Create a Scanner object
    Scanner scanner = new Scanner(System.in);

    // Prompt user to input purchase amount
    System.out.print("Enter Purchase Amount: ");
    double purchaseAmount = scanner.nextDouble();

    // Calculate state and County Sales Tax
    double stateSalesTax = purchaseAmount * STATE_SALES_TAX;

    double countySalesTax = purchaseAmount * COUNT_SALES_TAX;

    // Calculate Total Sales Tax
    double totalSalesTax = purchaseAmount * TOTAL_SALES_TAX;

    // Total Purchase Amount
    double totalPurchaseAmount = purchaseAmount + totalSalesTax;
    
    // Output Results
    System.out.println("Purchase Amount: " + purchaseAmount);
    System.out.println("State Sales Tax: " + stateSalesTax);
    System.out.println("County Sales Tax: " + countySalesTax);
    System.out.println("Total Sales Tax: " + totalSalesTax);
    System.out.println("Total Purchase Amount: " + totalPurchaseAmount);

    scanner.close();
    }
}