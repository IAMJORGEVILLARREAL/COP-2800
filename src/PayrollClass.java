 
// Jorge Villarreal Soules

import java.util.Scanner;

/**
 * The PayrollClass class manages payroll information for employees.
 */
public class PayrollClass {
    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    /**
     * Default constructor for the PayrollClass.
     */
    public PayrollClass() {
        // Default constructor
    }

    /**
     * Sets the hours worked for a given employee.
     *
     * @param employeeId    The employee ID.
     * @param hoursWorked   The hours worked by the employee.
     */
    public void setHours(int employeeId, int hoursWorked) {
        for (int i = 0; i < this.employeeId.length; i++) {
            if (this.employeeId[i] == employeeId) {
                hours[i] = hoursWorked;
                return;
            }
        }
        System.out.println("Employee ID not found.");
    }

    /**
     * Sets the pay rate for a given employee.
     *
     * @param employeeId    The employee ID.
     * @param payRate       The pay rate for the employee.
     */
    public void setPayRate(int employeeId, double payRate) {
        for (int i = 0; i < this.employeeId.length; i++) {
            if (this.employeeId[i] == employeeId) {
                this.payRate[i] = payRate;
                return;
            }
        }
        System.out.println("Employee ID not found.");
    }

    /**
     * Calculates the wages for a given employee.
     *
     * @param employeeId    The employee ID.
     * @return              The calculated wages.
     */
    public double calculateWages(int employeeId) {
        for (int i = 0; i < this.employeeId.length; i++) {
            if (this.employeeId[i] == employeeId) {
                wages[i] = hours[i] * payRate[i];
                return wages[i];
            }
        }
        return -1; // Employee ID not found
    }

    /**
     * Main method to demonstrate the PayrollClass.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayrollClass payroll = new PayrollClass();
    
        // Input hours worked and pay rate for each employee
        for (int i = 0; i < payroll.employeeId.length; i++) {
            System.out.println("Enter hours worked for employee " + payroll.employeeId[i] + ":");
            int workedHours = scanner.nextInt();
            while (workedHours < 0) {
                System.out.println("Hours cannot be negative. Enter hours worked for employee " + payroll.employeeId[i] + " again:");
                workedHours = scanner.nextInt();
            }
            payroll.setHours(payroll.employeeId[i], workedHours);
    
            System.out.println("Enter pay rate for employee " + payroll.employeeId[i] + ":");
            double payRate = scanner.nextDouble();
            while (payRate < 6.00) {
                System.out.println("Pay rate cannot be less than 6.00. Enter pay rate for employee " + payroll.employeeId[i] + " again:");
                payRate = scanner.nextDouble();
            }
            payroll.setPayRate(payroll.employeeId[i], payRate);
        }
    
        // Display gross wages for each employee
        for (int i = 0; i < payroll.employeeId.length; i++) {
            double wages = payroll.calculateWages(payroll.employeeId[i]);
            System.out.println("Employee ID: " + payroll.employeeId[i] + ", Gross Wages: " + wages);
        }
    
        scanner.close();
    }
}
