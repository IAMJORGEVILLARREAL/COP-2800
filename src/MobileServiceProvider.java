import javax.swing.JOptionPane;

public class MobileServiceProvider {
    public static void main(String[] args) {

        // Get user input for service package (A, B, or C)
        char packageLetter = JOptionPane.showInputDialog("Enter Your Service Package (A, B, or C): ").toUpperCase().charAt(0);
        
        // Get user input for minutes used
        double minutesUsed = Integer.parseInt(JOptionPane.showInputDialog("Enter Minutes Used: "));

        // Variable to store the total charges
        double totalCharges = 0;

        // Switch statement to handle different service packages
        switch (packageLetter) {
            case 'A':
                totalCharges = 39.99;
                // Additional charges for exceeding minutes limit
                if (minutesUsed > 450) {
                    totalCharges += (minutesUsed - 450) * 0.45;
                }
                break;

            case 'B':
                totalCharges = 59.99;
                // Additional charges for exceeding minutes limit
                if (minutesUsed > 900) {
                    totalCharges += (minutesUsed - 900) * 0.40;
                }
                break;

            case 'C':
                totalCharges = 69.99;
                break;

            default:
                // Display an error message for invalid package selection
                JOptionPane.showMessageDialog(null, "Invalid Selection.\n" + "Please Select A Valid Option.");
                return;
        }

        // Display the total charges to the user
        JOptionPane.showMessageDialog(null, "Total charges: $" + String.format("%.2f", totalCharges));
    }
}
