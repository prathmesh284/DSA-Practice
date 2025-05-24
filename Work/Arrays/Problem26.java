public class p26 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        
        int i=0;
        int j=1;
        int profit = 0;
        int price =0;
        while (j<arr.length) {
                if(arr[i]>arr[j]){
                    i=j;
                   
                }
                else if (arr[i]<arr[j]) {
                    price = arr[j]-arr[i];
                  profit=  Math.max(profit, price);
                }
                 j++;
        }
        System.out.println(profit);
    }
}
