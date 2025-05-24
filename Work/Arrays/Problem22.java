public class p22 {
    public static void main(String[] args) {
        int max=0;
        int count =0;
        int i=0;
        int j= i+1;
        int arr[]={2,2,1,1,1,2,2};

        while (i<j && j<arr.length) {
                if(arr[i]==arr[j]){
                    count++;
                 
                }   j++;
                 i++;
                 max = Math.max(max, count);
        }
        
        System.out.println(count);
       
    }
}
