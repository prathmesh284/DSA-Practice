// 14. Destination City

import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    static String destinationCity(String[][] paths){
        ArrayList<String> routes = new ArrayList<>();
        for(int i = 0; i < paths.length; i++){
            routes.add(paths[i][0]);
        }
        for(int i = 0; i < paths.length; i++){
            if(!routes.contains(paths[i][1])){
                return paths[i][1];
            }
        }
        return "";
    }
    public static void main(String[] args){
        String[][] paths = {{"London","New York"},
                            {"New York","Lima"},
                            {"Lima","Sao Paulo"}};
        System.out.println(destinationCity(paths));
    }
}