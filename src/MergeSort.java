import static java.lang.System.arraycopy;

public class MergeSort {

    static void mergeSort(int[] arr, int start, int end) {

        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int[] mix = new int[end - start];

        int i = start, j = mid, k = 0;


        while (i < mid && j < end) {

            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];

            } else {
                mix[k++] = arr[j++];

            }
        }

        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < end) {
            mix[k++] = arr[j++];
        }

        arraycopy(mix, 0, arr, start, mix.length);
    }
}

