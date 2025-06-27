//2. Bracket Validation with Priority Levels

import java.util.Stack;
class Solution {

    static int getPriority(char ch) {
        return switch (ch) {
            case '{' -> 3;
            case '[' -> 2;
            case '(' -> 1;
            default -> 0;
        };
    }

    static boolean isValidBracket(String str) {
        Stack<Character> bracketStack = new Stack<>();
        Stack<Integer> priorityStack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                int currentPriority = getPriority(ch);
                if (!priorityStack.isEmpty() && currentPriority > priorityStack.peek()) {
                    // lower priority bracket is wrapping a higher one -> INVALID
                    return false;
                }
                bracketStack.push(ch);
                priorityStack.push(currentPriority);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (bracketStack.isEmpty()) return false;

                char top = bracketStack.pop();
                priorityStack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidBracket("{[()]}"));
        System.out.println(isValidBracket("([{}])"));
        System.out.println(isValidBracket("{[]}"));
        System.out.println(isValidBracket("[{()}]")); 
        System.out.println(isValidBracket("{[}]")); 
        System.out.println(isValidBracket("({})"));
    }
}
