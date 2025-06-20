public class InsertionSort {
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Before sorting:");
        printArray(arr);
        sorter.insertionSort(arr);
        System.out.println("After sorting:");
        printArray(arr);
    }
    private static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
