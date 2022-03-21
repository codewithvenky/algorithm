public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 6, 7, 8, 9};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int[] left = new int[arr.length / 2];
            int[] right = new int[arr.length - left.length];
            for (int i = 0; i < left.length; i++) {
                left[i] = arr[i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = arr[i + left.length];
            }
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                arr[index] = left[leftIndex];
                leftIndex++;
            } else {
                arr[index] = right[rightIndex];
                rightIndex++;
            }
            index++;
        }
        while (leftIndex < left.length) {
            arr[index] = left[leftIndex];
            leftIndex++;
            index++;
        }
        while (rightIndex < right.length) {
            arr[index] = right[rightIndex];
            rightIndex++;
            index++;
        }
    }
}

