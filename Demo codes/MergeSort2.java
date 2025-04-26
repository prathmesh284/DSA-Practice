class MergeSort {

    static int[] mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            return new int[]{arr[low]};
        }

        int mid = (low + high) / 2;
        int[] leftSorted = mergeSort(arr, low, mid);
        int[] rightSorted = mergeSort(arr, mid + 1, high);

        return mergeArray(leftSorted, rightSorted);
    }

    static int[] mergeArray(int[] leftArr, int[] rightArr) {
        int n = leftArr.length;
        int m = rightArr.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            if (leftArr[i] <= rightArr[j]) {
                merged[k] = leftArr[i];
                k++;
                i++;
            } else {
                merged[k] = rightArr[j];
                k++;
                j++;
            }
        }

        while (i < n) {
            merged[k++] = leftArr[i++];
        }
        while (j < m) {
            merged[k++] = rightArr[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr = {13, 9, 5, 28, 8, 4};
        int low = 0, high = arr.length - 1;
        
        int[] sortedArr = mergeSort(arr, low, high);
        
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
