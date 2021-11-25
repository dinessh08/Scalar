package Day5.assignment;

public class AtleastTwoGreaterElement {
    public static void main(String[] args) {
        //You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.

        int[] A = {5, 17, 100, 11};//{1, 2, 3, 4, 5};

        int firstLargest = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            firstLargest = Math.max(firstLargest, A[i]);
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (firstLargest > A[i]) {
                secondLargest = Math.max(A[i], secondLargest);
            }
        }
        int[] result = new int[A.length - 2];
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != firstLargest && A[i] != secondLargest) {
                result[j] = A[i];
                j++;
            }
        }
        int[] answer = new int[j];
        for (int i = 0, k = 0; i < result.length; i++, k++) {
            if (result[i] != 0) {
                answer[k] = result[i];
            }
        }
        System.out.println(answer);
    }
}
