package Day63.Sorting3.assignment;

public class PickAlternateString {
    // Program to get first two characters in a string
    public static void main(String[] args) {

        String input = "I love India";//I_vend
        char[] arr = input.toCharArray();
        char[] resultarr = new char[input.length() / 2];
        int j = 0;
        //Using char array
        for (int i = 0; i < arr.length; i = i + 4) {
            resultarr[j] = arr[i];
            j++;
            resultarr[j] = arr[i + 1];
            j++;
        }
        String result = "";
        //Without char array
        System.out.println(resultarr);
        for (int i = 0; i < input.length(); i = i + 4) {
            result = result + input.substring(i, i + 2);
        }
        System.out.println(result);
    }
}
