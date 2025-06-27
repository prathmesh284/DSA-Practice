//1. Stack With Undo Feature

import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    static class StackWithUndo {
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> history = new ArrayList<>();

        void push(int x) {
            stack.push(x);
            history.add("push " + x);
        }

        void pop() {
            if (!stack.isEmpty()) {
                int removed = stack.pop();
                history.add("pop " + removed);
            }
        }

        void undo() {
            if (history.isEmpty()) {
                System.out.println("Nothing to undo");
                return;
            }

            String lastAction = history.remove(history.size() - 1);
            String[] parts = lastAction.split(" ");
            String action = parts[0];
            int value = Integer.parseInt(parts[1]);

            if (action.equals("push")) {
                stack.pop(); // undo push -> pop
            } else if (action.equals("pop")) {
                stack.push(value); // undo pop -> push
            }
        }

        void printStack() {
            System.out.println("Current stack: " + stack);
        }
    }

    public static void main(String[] args) {
        StackWithUndo swu = new StackWithUndo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Commands: push <num>, pop, undo, print, exit");

        while (true) {
            String input = sc.nextLine();
            String[] cmd = input.split(" ");

            switch(cmd[0]) {
                case "push" -> {
                    int val = Integer.parseInt(cmd[1]);
                    swu.push(val);
                }
                case "pop" -> swu.pop();
                case "undo" -> swu.undo();
                case "print" -> swu.printStack();
                case "exit" -> {
                    return;
                }
                default -> System.out.println("Invalid command");
            }
        }
    }
}
