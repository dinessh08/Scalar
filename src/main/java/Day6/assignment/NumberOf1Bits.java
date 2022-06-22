package Day6.assignment;

public class NumberOf1Bits {
    public static void main(String[] args) {

        //Write a function that takes an integer and returns the number of 1 bits it has.

        int A = 7;

        int setBits = 0;
        for (int i = 0; i < 32; i++) {
            if (((A >> i) & 1) == 1) {
                setBits++;
            }
        }
        System.out.println(setBits);
    }
}
