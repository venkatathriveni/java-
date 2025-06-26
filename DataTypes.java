import java.util.Scanner;

public class DataTypeFitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = 0;

        try {
            t = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid number of test cases.");
            return;
        }

        for (int i = 0; i < t; i++) {
            String value = scanner.nextLine();

            try {
                long num = Long.parseLong(value);
                System.out.println(value + " can be fitted in:");

                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // A long value always fits in long
                System.out.println("* long");

            } catch (NumberFormatException e) {
                System.out.println(value + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
