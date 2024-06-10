

import java.util.Random;

public class StudentIDGenerator {
    public static void main(String[] args) {
        String firstName = "John";
        String fatherName = "Doe";
        int batch = 2022;
        long phoneNumber = 9876543210L;

        String studentID = generateStudentID(firstName, fatherName, batch, phoneNumber);
        System.out.println("Generated Student ID: " + studentID);
    }

    public static String generateStudentID(String firstName, String fatherName, int batch, long phoneNumber) {
        // Define the pattern for the Student ID
        String pattern = "FN%sF%sB%dP%04d";

        // Extract the first two characters of the first name
        String firstNameInitials = firstName.substring(0, 2).toUpperCase();

        // Extract the first two characters of the father name
        String fatherNameInitials = fatherName.substring(0, 2).toUpperCase();

        // Generate a random 4-digit number
        Random random = new Random();
        int randomNumber = random.nextInt(10000);

        // Format the Student ID using the pattern
        String studentID = String.format(pattern, firstNameInitials, fatherNameInitials, batch, randomNumber);

        return studentID;
    }
}
