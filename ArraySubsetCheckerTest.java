import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SubsetTest {

    @Test
    public void testSubset() {
        int[] array1 = {33, 51, 5, 31, 9, 4, 3};
        int[] array2 = {51, 9, 33, 3};
        assertTrue(isSubset(array1, array2));
    }

    @Test
    public void testNotSubset() {
        int[] array1 = {14, 11, 33, 2, 9, 1};
        int[] array2 = {11, 2, 7, 1};
        assertFalse(isSubset(array1, array2));
    }

    public boolean isSubset(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : array1) {
            set.add(i);
        }

        for (int i : array2) {
            if (!set.contains(i)) {
                return false;
            }
        }

        return true;
    }
}