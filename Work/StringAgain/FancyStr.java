// Fancy String

class Solution {
    static String fancyString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char ch = ' ';
        for(int i = 0; i < str.length(); i++){
            if(ch != str.charAt(i)){
                sb.append(str.charAt(i));
                count = 1;
                ch = str.charAt(i);
            }else{
                if(count < 2){
                    sb.append(str.charAt(i));
                    count++;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "leeeteeecodeee";
        System.out.println(fancyString(str));
    }
}
