package Allproject;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentIDGeneratorTest {

    @Test
    public void testGenerateID() {
        String firstName = "John";
        String fatherName = "Doe";
        String batch = "2024";
        String phoneNumber = "1234567890";
        
        String expectedID = "JOHDOE24";
        String actualID = StudentIDGenerator.generateID(firstName, fatherName, batch, phoneNumber);
        
        assertEquals(expectedID, actualID);
    }
}
