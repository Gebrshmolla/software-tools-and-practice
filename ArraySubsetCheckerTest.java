package Allproject;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArraySubsetCheckerTest {

    @Test
    public void testIsSubset_True() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 5};
        assertTrue(ArraySubsetChecker.isSubset(arr1, arr2));
    }

    @Test
    public void testIsSubset_False() {
        int[] arr1 = {1, 2, 6};
        int[] arr2 = {1, 2, 3, 4, 5};
        assertFalse(ArraySubsetChecker.isSubset(arr1, arr2));
    }

    @Test
    public void testIsSubset_EmptyArray() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3, 4, 5};
        assertTrue(ArraySubsetChecker.isSubset(arr1, arr2));
    }

    @Test
    public void testIsSubset_SameArray() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        assertTrue(ArraySubsetChecker.isSubset(arr1, arr2));
    }
}
