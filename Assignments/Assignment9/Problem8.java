// Derangement (No Fixed Position)

class Solution {
    // static int derangement(int n) {
    //     int fact = 1;
    //     for (int i = 1; i <= n; i++) {
    //         fact *= i;
    //     }

    //     double sum = 1.0;
    //     int counter = 1;

    //     for (int i = 2; i <= n; i++) {
    //         counter *= i;
    //         if (i % 2 == 0) {
    //             sum += 1.0 / counter;
    //         } else {
    //             sum -= 1.0 / counter;
    //         }
    //         System.out.println((int)sum);
    //     }

    //     return (int)Math.round(fact * sum);
    // }

    public static void main(String[] args) {
        int n = 3;
        // System.out.println(derangement(n));
    }
}