import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String input1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String input2 = scanner.nextLine();

        if (isAnagram(input1, input2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        scanner.close();
    }
}
