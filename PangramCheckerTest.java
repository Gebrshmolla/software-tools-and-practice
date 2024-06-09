import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PangramCheckerTest {

    @Test
    public void testIsPangram() {
        PangramChecker pangramChecker = new PangramChecker();

        // Test a known pangram
        assertTrue(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog"));

        // Test a sentence that is not a pangram
        assertFalse(pangramChecker.isPangram("Hello World"));

        // Test a sentence with uppercase letters
        assertTrue(pangramChecker.isPangram("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));

        // Test a sentence with non-letter characters
        assertTrue(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog!"));

        // Test an empty sentence
        assertFalse(pangramChecker.isPangram(""));

        // Test a sentence with only one letter
        assertFalse(pangramChecker.isPangram("a"));

        // Test a sentence with all letters except one
        assertFalse(pangramChecker.isPangram("The quick brown fox jumps over the lazy do"));
    }
}