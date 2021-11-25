package Day5.assignment;

import java.util.Arrays;

public class SmallerandGreater {
    public static void main(String[] args) {

        //Find for how many elements, there is a strictly smaller element and a strictly greater element

        int[] A = {1, 2, 3};

        Arrays.sort(A);
        int result = A.length - 2;
        System.out.println(result);

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            minimum = Math.min(minimum, A[i]);
            maximum = Math.max(maximum, A[i]);
        }
        result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > minimum && A[i] < maximum) {
                result++;
            }
        }
        System.out.println(result);
    }
}
