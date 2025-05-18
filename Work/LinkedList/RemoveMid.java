class Solution {
    static Node removeMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1,null);
        Node head = n1;
        Node n2 = new Node(2,null);
        n1.next = n2;
        Node n3 = new Node(3,null);
        n2.next = n3;
        Node n4 = new Node(2,null);
        n3.next = n4;
        Node n5 = new Node(1,null);
        n4.next = n5;
        Node temp = removeMid(head);
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
class Node {
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}