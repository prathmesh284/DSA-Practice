// 9. Watering Plants

class Solution {
    static int wateringPlants(int[] plants, int capacity){
        int steps = 0;
        int remaining = capacity;
        for(int i = 0; i < plants.length; i++){
            remaining = remaining - plants[i];
            steps++;
            if((i < plants.length-1) && remaining < plants[i+1]){
                steps += 2*(i + 1);
                remaining = capacity;
            }
            
        }
        return steps;
    }
    public static void main(String[] args) {
        // int[] plants = {2,2,3,3};
        // int capacity = 5;
        int[] plants = {1,1,1,4,2,3};
        int capacity = 4;
        System.out.println(wateringPlants(plants,capacity));
    }
}