//Find point from which cycle is created

class Solution {
    static int pointOfCreation(Node head){
        Node slow = head;
        Node fast = head;
        Node stat = head;

        while(fast != null && fast.next != null){
            if(fast.next == slow.next){
                stat = stat.next;
                fast = stat;
                slow = stat;
            }
            slow = slow.next;
            fast = fast.next.next;

            if(stat.next == slow.next || stat.next == fast.next){
                return stat.next.data;
            }
        }
        return -1;
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
        System.out.println(pointOfCreation(n1)); 
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