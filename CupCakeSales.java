public class CupcakeSales {
    public static int sumLargeTransactions(int N, int[] A) {
        int total = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] >= 5) {
                total += A[i];
            }
        }
        return total > 0 ? total : 0;
    }
    public static void main(String[] args) {
        int N = 6; 
        int[] A = {1, 2, 5, 3, 8, 7};
        int result = sumLargeTransactions(N, A);
        System.out.println(result);  
    }
}
