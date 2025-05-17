//Reverse the LinkedList

class Solution{
    //Reverse LinkedList Call
    static Node reverseLinkedList(Node head){
        Node prevNode = null;
        Node temp = head;
        while(temp != null){
            Node front = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = front;
        }
        return prevNode;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1,null);
        Node head = n1;
        Node n2 = new Node(2,null);
        n1.next = n2;
        Node n3 = new Node(3,null);
        n2.next = n3;
        Node n4 = new Node(4,null);
        n3.next = n4;
        Node n5 = new Node(5,null);
        n4.next = n5;
        Node n6 = new Node(6,null);
        n5.next = n6;

        Node start = head;
        while(start != null){
            System.out.print(start.data);
            start = start.next;
        }
        System.out.println();

        //Reverse LinkedList Function call
        // System.out.println(ReverseLinkedList(head));
        start = reverseLinkedList(head);
        while(start != null){
            System.out.print(start.data);
            start = start.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}