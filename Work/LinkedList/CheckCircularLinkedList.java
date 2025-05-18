//Check linked list is circular or not

// class Solution{
//     static boolean isCircular(Node head){
//         Node firstNode = head;
//         Node prev = null;
//         Node temp = head;
//         while(temp != null){
//             if(temp.next == firstNode){
//                 return true;
//             }
//             Node front = temp.next;
//             temp.next = prev;
//             prev = temp;
//             temp = front;
//             // System.out.println(temp.data);
//         }
//         return  false;
//     }
//     public static void main(String[] args) {
//         Node n1 = new Node(1, null);
//         Node n2 = new Node(2, null);
//         n1.next = n2;
//         Node n3 = new Node(3, null);
//         n2.next = n3;
//         Node n4 = new Node(4, null);
//         n3.next = n4;
//         Node n8 = new Node(8, null);
//         n4.next = n8;
//         Node n5 = new Node(5, null);
//         n8.next = n5;
//         n5.next = n3;
//         System.out.println(isCircular(n1)); 
//     }
// }
// class Node {
//     int data;
//     Node next;
//     public Node(int data, Node next){
//         this.data = data;
//         this.next = next;
//     }
// }





class Solution{
    static boolean isCircular(Node head){
        Node firstNode = head;
        Node temp = head;
        while(temp != null && firstNode != null){
            if(temp.next == firstNode){
                return true;
            }
            temp = temp.next;
            firstNode = firstNode.next.next;
        }
        return  false;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1, null);
        Node n2 = new Node(2, null);
        n1.next = n2;
        Node n3 = new Node(3, null);
        n2.next = n3;
        Node n4 = new Node(4, null);
        n3.next = n4;
        Node n8 = new Node(8, null);
        n4.next = n8;
        Node n5 = new Node(5, null);
        n8.next = n5;
        n5.next = n3;
        System.out.println(isCircular(n1)); 
    }
}
class Node {
    int data;
    Node next;
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}