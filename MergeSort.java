public class MergeSort {
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        mergeSort(arr, 0, arr.length - 1);
    }
    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return; 
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);       
        mergeSort(arr, mid + 1, right);  
        merge(arr, left, mid, right);   
    }
    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;       
        int j = mid + 1;    
        int k = 0;          
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, left, temp.length);
    }
    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before sorting:");
        printArray(arr);
        sorter.mergeSort(arr);
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
