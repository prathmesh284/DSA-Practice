
import java.util.HashSet;
class Solution{

    static HashSet<String> hs = new HashSet<>();

    static void arrangeBalls(int green, int yellow, int red, int sum, int count, char last, String str){
        if(str.length() == sum){
            // System.out.println(str);
            hs.add(str);
            // System.out.println(count);
            return;
        }
        for(int i = 1; i <= sum ; i++){

            if(last != 'G' && green > 0){
                arrangeBalls(green-1,yellow,red,sum,count+1,'G',str+'G');
            }
            if(last != 'Y' && yellow > 0){
                arrangeBalls(green,yellow-1,red,sum,count+1,'Y',str+'Y');
            }
            if(last != 'R' && red > 0){
                arrangeBalls(green,yellow,red-1,sum,count+1,'R',str+'R');
            }
        }
    }

    public static void main(String[] args){
        int green = 1;
        int yellow = 1;
        int red = 0;
        int sum = green+yellow+red;
        arrangeBalls(green,yellow,red,sum,0,' ',"");
        System.out.println(hs);
    }
}