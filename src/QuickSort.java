public class QuickSort {

    static void quickSort(int[] arr, int low, int hi) {

        if (low >= hi) {
            return;
        }

        int start = low;
        int end = hi;
        int m = start + (end - start) / 2;

        int pivot = arr[m];

        while (start <= end) {

            while (arr[start] < pivot) {

                start++;
            }
            while (arr[end] > pivot) {

                end--;
            }

            if (start <= end) {

                swap(arr, start, end);

                start++;
                end--;
            }


        }

        quickSort(arr, low, end);

        quickSort(arr, start, hi);

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
