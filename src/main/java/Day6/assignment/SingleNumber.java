package Day6.assignment;

public class SingleNumber {
    public static void main(String[] args) {

        //Given an array of integers A, every element appears twice except for one. Find that single one.

        int[] A = {1, 2, 2, 1, 2, 3, 2, 5, 5};

        int answer = A[0];
        for (int i = 1; i < A.length; i++) {
            answer = answer ^ A[i];
        }
        System.out.println(answer);
    }
}
