import java.util.HashSet;
import java.util.Scanner;
public class HotelVacancy {
    public static int countVacantRooms(int N, int[] reservedRooms, int T) {
        HashSet<Integer> reservedSet = new HashSet<>();
        for (int room : reservedRooms) {
            reservedSet.add(room);
        }
        return T - reservedSet.size();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String reservedString = scanner.nextLine();
        int[] reservedRooms = new int[reservedString.length()];
        for (int i = 0; i < reservedString.length(); i++) {
            reservedRooms[i] = reservedString.charAt(i) - '0'; 
        }
        int T = Integer.parseInt(scanner.nextLine());
        int vacant = countVacantRooms(N, reservedRooms, T);
        System.out.println(vacant);
    }
}
