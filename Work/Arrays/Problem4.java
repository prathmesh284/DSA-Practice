import java.util.ArrayList;

class p4 {
    static ArrayList<Integer> union(int arr1[], int arr2[]) {
        int j = 0;
        int i = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                temp.add(arr2[j]);
                j++;
            } else {
                temp.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i<arr1.length) {
            temp.add(arr1[i]);
            i++;
        }
        while (j<arr2.length) {
            temp.add(arr2[j]);
            j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        ArrayList<Integer> result = union(arr1, arr2);
        System.out.println(result);
    }
}
