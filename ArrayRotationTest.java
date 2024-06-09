package Allproject;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ArrayRotationTest {

    @Test
    public void testLeftRotate() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayRotation.leftRotate(arr, 2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);
    }

    @Test
    public void testLeftRotateWithZero() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayRotation.leftRotate(arr, 0);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testLeftRotateWithNegative() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayRotation.leftRotate(arr, -2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);
    }
}

