//Rotate String
class Solution{
    static boolean isRotated(String str,String goal){
        if(str.length() != goal.length()){
            return false;
        }
        else if(str.equals(goal)){
            return true;
        }
        else if((str+str).contains(goal)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "ABCDE";
        String goal = "CDEAB";
        System.out.println(isRotated(str,goal));
    }
}