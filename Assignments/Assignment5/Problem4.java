//Find the Difference of Two Arrays

import java.util.HashSet;
import java.util.Iterator;

class Solution {
    //Brute force

    // static HashSet<Integer>[] differenceOfArrays(int[] arr1, int[] arr2) {
    //     HashSet<Integer> hs1 = new HashSet<>();
    //     HashSet<Integer> hs2 = new HashSet<>();
    //     for (int num : arr1) {
    //         hs1.add(num);
    //     }
    //     for (int num : arr2) {
    //         hs2.add(num);
    //     }
    //     HashSet<Integer> onlyInArr1 = new HashSet<>(hs1);
    //     onlyInArr1.removeAll(hs2);
    //     HashSet<Integer> onlyInArr2 = new HashSet<>(hs2);
    //     onlyInArr2.removeAll(hs1);
    //     return new HashSet[]{onlyInArr1, onlyInArr2};
    // }

    //Time Complexity: O(n+m)
    //Space Complexity: O(2n+2m)



    //Better approach
    static HashSet<Integer>[] differenceOfArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for (int num : arr1) {
            hs1.add(num);
        }
        for (int num : arr2) {
            hs2.add(num);
        }

        Iterator<Integer> it1 = hs1.iterator();
        while (it1.hasNext()) {
            int ele = it1.next();
            if (hs2.contains(ele)) {
                it1.remove();
                hs2.remove(ele); 
            }
        }
        return new HashSet[]{hs1, hs2};
    }
    
    //Time Complexity: O(2n+m)
    //Space Complexity: O(n+m)

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3}, arr2 = {2, 4, 6};
        HashSet[] hs = differenceOfArrays(arr1, arr2);
        for (HashSet set : hs) {
            System.out.println(set);
        }
    }
}