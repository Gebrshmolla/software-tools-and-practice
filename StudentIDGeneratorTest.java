import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentIDGeneratorTest {

    @Test
    public void testGenerateStudentID() {
        String firstName = "John";
        String fatherName = "Doe";
        int batch = 2022;
        long phoneNumber = 9876543210L;

        String expectedPattern = "FNJOFOB2022P%d";
        String generatedID = StudentIDGenerator.generateStudentID(firstName, fatherName, batch, phoneNumber);

        assertNotNull(generatedID);
        assertEquals(12, generatedID.length()); // length of the generated ID should be 12
        assertEquals(true, generatedID.matches(expectedPattern)); // generated ID should match the expected pattern
    }

    @Test
    public void testGenerateStudentID_InvalidInput() {
        String firstName = "";
        String fatherName = "";
        int batch = 0;
        long phoneNumber = 0L;

        String generatedID = StudentIDGenerator.generateStudentID(firstName, fatherName, batch, phoneNumber);

        assertEquals(null, generatedID); // generated ID should be null for invalid input
    }

    @Test
    public void testGenerateStudentID_NullInput() {
        String firstName = null;
        String fatherName = null;
        int batch = 2022;
        long phoneNumber = 9876543210L;

        String generatedID = StudentIDGenerator.generateStudentID(firstName, fatherName, batch, phoneNumber);

        assertEquals(null, generatedID); // generated ID should be null for null input
    }
}