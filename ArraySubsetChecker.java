import java.util.*;






public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {33, 51, 5, 31, 9, 4, 3};
        Integer[] array2 = {51, 9, 33, 3};

        List<Integer> list = new ArrayList<>(Arrays.asList(array1));

        if (list.containsAll(Arrays.asList(array2))) {
            System.out.println("array2 is a subset of array1");
        } else {
            System.out.println("array2 is not a subset of array1");
        }
    }
}