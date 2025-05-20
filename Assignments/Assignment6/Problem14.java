//Destination City

import java.util.HashSet;
class Solution {
    static String destinationCity(String[][] paths){
        HashSet<String> startCities = new HashSet<>();
        for (String[] path : paths) {
            startCities.add(path[0]);
        }
        for (String[] path : paths) {
            String destination = path[1];
            if (!startCities.contains(destination)) {
                return destination;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[][] paths = {{"B","C"},{"D","B"},{"C","A"}};
        System.out.println(destinationCity(paths));

    }
}
// Time Complexity: O(2n)
// Space Complexity: O(n)
