import java.util.Scanner;

// Jorge Villarreal Soules
public class Payroll {

    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private double hoursWorked;

    // Constructor to initialize name and ID
    public Payroll(String name, int id) {
        employeeName = name;
        idNumber = id;
    }

    // Getter for employee name
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for employee name
    public void setEmployeeName(String name) {
        employeeName = name;
    }

    // Getter for employee ID
    public int getIdNumber() {
        return idNumber;
    }

    // Setter for employee ID
    public void setIdNumber(int id) {
        idNumber = id;
    }

    // Getter for hourly pay rate
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    // Setter for hourly pay rate
    public void setHourlyPayRate(double payR) {
        hourlyPayRate = payR;
    }

    // Getter for hours worked
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Setter for hours worked
    public void setHoursWorked(double hoursW) {
        hoursWorked = hoursW;
    }

    // Method to calculate gross pay
    public double grossPay() {
        return hoursWorked * hourlyPayRate;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompts the Employee to Enter Employee Information
        System.out.println("Enter Employee's Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter Hourly Pay Rate: ");
        double payR = scanner.nextDouble();

        System.out.println("Enter Amount of Hours Worked: ");
        double hoursW = scanner.nextDouble();

        // Create new Payroll object with name and id
        Payroll payroll = new Payroll(name, id);

        // Set hourly pay rate and hours worked
        payroll.setHoursWorked(hoursW);
        payroll.setHourlyPayRate(payR);

        // Display the gross pay
        System.out.println(name +" " + id + " Your Gross Pay is: " + payroll.grossPay());

        scanner.close();
    }
}
