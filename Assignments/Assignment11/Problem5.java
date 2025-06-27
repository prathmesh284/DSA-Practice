// 5. Simulate Asteroid Collision

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    static ArrayList<Integer> asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (Math.abs(a) > top) {
                    stack.pop(); // current asteroid destroys the one on top
                } else if (Math.abs(a) == top) {
                    stack.pop(); // both explode
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // current asteroid is destroyed
                    break;
                }
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        // Convert stack to list
        return new ArrayList<>(stack);
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        ArrayList<Integer> ans = asteroidCollision(asteroids);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}
