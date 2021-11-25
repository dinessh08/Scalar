package Day5.assignment;

public class PatternPrinting {
    public static void main(String[] args) {

        int A = 1;

        int[][] result = new int[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                result[i][j] = j + 1;
            }
        }
        System.out.println(result);
    }
}
