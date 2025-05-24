class p2{
public static void main(String[] args) {
         int arr[]={1,0,2,3,0,4,0,1};
    int j = -1;
     for (int i = 0; i < arr.length; i++) {
         
        if (arr[i]==0){
            j=i;
            break;
        }
      

     }
      
         for (int k = j+1; k < arr.length; k++) {
            if(arr[k]!= 0){
                int temp = arr[k];
                arr[k]=arr[j];
                arr[j]= temp;
                 j++;
            }
           
            
        
     }
      
     for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]+" ");
     }
}
}
