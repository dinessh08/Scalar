package Day63.Sorting3.assignment;

public class QuickSort {

    public static void main(String[] args) {

        QuickSort sort = new QuickSort();
        int[] A = {3,7,1};//{1, 4, 10, 2, 1, 5};
        sort.solve(A);
        System.out.println(A);
    }

    public int[] solve(int[] A) {

        quickSort(A, 0, A.length - 1);
        return A;
    }

    public void quickSort(int[] A, int start, int end) {
        if (start > end) {
            return;
        }
        if (start == end) {
            return;
        }
        int pivotIndex = reArrange(A, start, end);
        quickSort(A, start, pivotIndex - 1);
        quickSort(A, pivotIndex + 1, end);
        return;
    }

    public int reArrange(int[] A, int start, int end) {

        int pivotIndex = start;
        while (start <= end) {
            if (A[pivotIndex] >= A[start]) {
                start++;
            } else if (A[pivotIndex] < A[end]) {
                end--;
            } else {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }
        }
        int temp = A[pivotIndex];
        A[pivotIndex] = A[start - 1];
        A[start - 1] = temp;
        return start - 1;
    }
}
