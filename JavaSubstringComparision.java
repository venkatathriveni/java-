import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        // Input substring start and end index
        System.out.println("Enter start index for substring:");
        int start = scanner.nextInt();

        System.out.println("Enter end index for substring (exclusive):");
        int end = scanner.nextInt();

        // Validate input
        if (start < 0 || end > str1.length() || end > str2.length() || start >= end) {
            System.out.println("Invalid substring indices.");
        } else {
            // Extract substrings
            String sub1 = str1.substring(start, end);
            String sub2 = str2.substring(start, end);

            // Compare
            if (sub1.equals(sub2)) {
                System.out.println("Substrings are equal: \"" + sub1 + "\"");
            } else {
                System.out.println("Substrings are NOT equal.");
                System.out.println("From first string: \"" + sub1 + "\"");
                System.out.println("From second string: \"" + sub2 + "\"");
            }
        }

        scanner.close();
    }
}
