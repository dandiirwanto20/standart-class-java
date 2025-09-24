package learn.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] number = {
                1, 223, 312, 4324, 52123, 622, 74, 82, 912, 10111
        };

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));

        System.out.println(Arrays.binarySearch(number, 223));
        System.out.println(Arrays.binarySearch(number, 622));
        System.out.println(Arrays.binarySearch(number, 69));

        int[] result = Arrays.copyOf(number, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(number, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
