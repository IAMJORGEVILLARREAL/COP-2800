// Jorge Villarreal Soules

import javax.swing.JOptionPane;

public class SumOfNumbers {
    public static void main(String[] args) {
        
        // Declare variable to hold user input
        int num;

        // Prompt user to input a positive nonzero integer value and store in variable
        String enterNumber = JOptionPane.showInputDialog("Enter a positive nonzero number: ");
        // Convert enterNumber to data-type int
        num = Integer.parseInt(enterNumber);

        // Declare variable to hold sum
        int sum = 0;
        
        // Construct loop to obtain sum of all integers 1 up to the number entered
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        // Out put the sum of any integer >= 1 up to the number entered
        JOptionPane.showMessageDialog(null, "The sum of integers from 1 to " + num + " = " + sum);

    }
}
