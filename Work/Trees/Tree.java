// Tree Comstruction and traversal.

import java.util.ArrayList;
import java.util.Stack;

class GenericTree{
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        public Node(int data){
            this.data = data;
        }
    }

    static Node constructTree(int[] arr){
        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == -1){
                st.pop();
            }else{
                Node node = new Node(arr[i]);
                if(st.isEmpty()){
                    root = node;
                }else{
                    st.peek().children.add(node);
                }
                st.push(node);
            }
        }
        return root;
    }

    static void printTree(Node root){
        StringBuilder sb = new StringBuilder();
        sb.append(root.data).append(" --> ");
        for(Node child:root.children){
            sb.append(child.data).append(", ");
        }
        sb.delete(sb.length()-2, sb.length()).append(".");
        System.out.println(sb.toString());

        for(Node child:root.children){
            printTree(child);
        }
    }

    public static void main(String[] args){
        int[] arr = {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};
        Node root = constructTree(arr);
        printTree(root);
    }
}