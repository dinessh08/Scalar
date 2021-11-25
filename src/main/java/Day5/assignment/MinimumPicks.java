package Day5.assignment;

public class MinimumPicks {
    public static void main(String[] args) {

        int[] A = {0, 2, 9};

        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                maxEven = Math.max(maxEven, A[i]);
            } else {
                minOdd = Math.min(minOdd, A[i]);
            }
        }
        System.out.println(maxEven - minOdd);
    }
}
