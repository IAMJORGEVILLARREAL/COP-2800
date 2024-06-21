public class NameInitials {
    public static void main(String[] args) {

        // Declare and initialize variables for first, middle, and last names
        String firstName = "Jorge";
        String middleName = "Alfredo";
        String lastName = "Villarreal Soules";

        // Get the first character of each name to extract initials
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        // Print the full name and initials
        System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Initials : " + firstInitial + " " + middleInitial + " " + lastInitial);
    }
}
