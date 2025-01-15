package Sorting.Medium;

public class SegregateEvenandOddNumbers {
    void segregateEvenOdd(int arr[]) {
        if (arr.length <= 1) {
            return;
        }

        int left = 0, right = arr.length - 1;

        // Step 1: Segregate even and odd numbers
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Find the correct partition index between even and odd numbers
        int partitionIndex = 0;
        while (partitionIndex < arr.length && arr[partitionIndex] % 2 == 0) {
            partitionIndex++;
        }

        // Step 2: Use Quick Sort on even and odd partitions
        quickSort(arr, 0, partitionIndex - 1); // Sort even numbers
        quickSort(arr, partitionIndex, arr.length - 1); // Sort odd numbers
    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}
