// Minimum Time to Complete Trips
import java.util.Arrays;
class Solution{
    static int minTimeToCompleteTrips(int[] times,int totalTrips) {
        Arrays.sort(times);
        int count = 0;
        int index = 0;
        while(count < totalTrips){
            if(count < totalTrips){
                count += times[index];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] times = {1,2,3};
        int totalTrips = 5;
        System.out.println(minTimeToCompleteTrips(times,totalTrips));
    }
}
