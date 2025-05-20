//Rotate Linked List by Every K Elements

class Solution{
    static Node rotateListByKNodes(Node head,int k){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node kthNode = findKthNode(temp,k);
            if(kthNode == null){
                prev.next = temp;
                break;
            }
            Node front = kthNode.next;
            kthNode.next = null;
            Node reversedHead = reverseLinkedList(temp);
            if (prev == null) {
                head = reversedHead;
            } else {
                prev.next = reversedHead;
            }
            prev = temp;
            temp = front;
        }
        return head;
    }

    static Node reverseLinkedList(Node head) {
        Node prev = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    static Node findKthNode(Node node, int k) {
        int count = 1;
        while (node != null && count < k) {
            node = node.next;
            count++;
        }
        return node;
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
        Node n7 = new Node(7,null);
        n6.next = n7;
        Node n8 = new Node(8,null);
        n7.next = n8;
        Node n9 = new Node(9,null);
        n8.next = n9;
        Node n10 = new Node(10,null);
        n9.next = n10;

        int k = 4;
        Node start = rotateListByKNodes(head,k);

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