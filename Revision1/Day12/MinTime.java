// 3. Minimum Time to Complete Trips

class Solution {
    static int minTimeToComplete(int[] time,int totalTrips){
        int trip = 0,count = 0;
        while(count < totalTrips){
            trip++;
            for(int i = 0; i < time.length; i++){
                if(trip%time[i] == 0){
                    count++;
                }
            }
        }
        return trip;
    }
    public static void main(String[] args) {
        int[] time = {2};
        int totalTrips = 1;
        System.out.println(minTimeToComplete(time,totalTrips));
    }
}