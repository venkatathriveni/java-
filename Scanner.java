import java.util.Scanner;
public class SpecialSubarrays {
    public static int countSpecialSubarrays(int[] arr) {
        int count = 0;                                                    
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + arr[i + 2] == arr[i + 1]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int result = countSpecialSubarrays(arr);
        System.out.println(result);
    }
}
