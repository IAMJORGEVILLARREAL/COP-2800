import javax.swing.JOptionPane;

public class ShippingCharges {
    public static void main(String[] args) { 

        // Get user input for package weight
        String weightString = JOptionPane.showInputDialog("Enter Package weight: ");
        double weight = Double.parseDouble(weightString);
        JOptionPane.showMessageDialog(null, "Package is " + weight + " LBS");

        // Get user input for shipping distance
        String shippingDistanceString = JOptionPane.showInputDialog("Enter Shipping Distance: ");
        double distance = Double.parseDouble(shippingDistanceString);
        JOptionPane.showMessageDialog(null, "The Shipping Distance is " + shippingDistanceString + " miles"); 

        // Variable to store the cost based on the weight of the package
        double weightCost;

        // Determine the cost based on the weight of the package
        if (weight <= 2) {
            weightCost = 1.10;
        } else if (weight <= 6) {
            weightCost = 2.20;
        } else if (weight <= 10) {
            weightCost = 3.70;
        } else {
            weightCost = 3.80;
        }

        // Calculate shipping cost based on weight and distance
        double shippingCost = weightCost * (Math.ceil(distance / 500));

        // Display the calculated shipping cost
        JOptionPane.showMessageDialog(null, "Shipping cost is: $" + String.format("%.2f", shippingCost));

    }
}
