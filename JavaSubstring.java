import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Print substring from start to end (exclusive of end)
        System.out.println(s.substring(start, end));

        scanner.close();
    }
}
