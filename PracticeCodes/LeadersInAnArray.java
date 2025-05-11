// By using ArrayList

// import java.util.ArrayList;
// class LeadersInAnArray{
//     static void LeadersInAnArray(int[] arr){
//         ArrayList<Integer> al = new ArrayList<>();
//         int sum = 0;
//         for(int i = arr.length-1;i >= 0;i--){
//             if(arr[i] > sum){
//                 al.add(arr[i]);
//             }
//             sum = Math.max(sum,arr[i]);
//         }
//         System.out.println(al);
//     }
//     public static void main(String[] args) {
//         int[] arr = {10,22,12,3,0,6};
//         LeadersInAnArray(arr);
//     }
// }

//Time Complexity: O(n)
//Space Complexity: O(n)





//Without using ArrayList

class LeadersInAnArray{
    static void LeadersInAnArray(int[] arr){
        int sum = 0;
        for(int i = arr.length-1;i >= 0;i--){
            if(arr[i] > sum){
                System.out.print(arr[i]+" ");
            }
            sum = Math.max(sum,arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        LeadersInAnArray(arr);
    }
}


//Time Complexity: O(n)
//Space Complexity: O(1)