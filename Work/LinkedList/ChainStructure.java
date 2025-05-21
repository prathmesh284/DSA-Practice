// Chained Linked List

class Solution{
    static Node createChainStructure(Node head) {
        Node current = head;
        while (current != null) {
            if (current.child != null) {
                Node nextNode = current.next;
                Node child = createChainStructure(current.child);
                current.next = child;
                child.prev = current;
                Node childTail = child;
                while (childTail.next != null) {
                    childTail = childTail.next;
                }
                if (nextNode != null) {
                    childTail.next = nextNode;
                    nextNode.prev = childTail;
                }
                current.child = null;
            }
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1,null,null,null);
        Node head = n1;
        Node n2 = new Node(2,null,null,null);
        n1.next = n2;
        n2.prev = n1;
        Node n3 = new Node(3,null,null,null);
        n2.next = n3;
        n3.prev = n2;
        Node n4 = new Node(4,null,null,null);
        n3.next = n4;
        n4.prev = n3;
        Node n5 = new Node(5,null,null,null);
        n4.next = n5;
        n5.prev = n4;
        Node n6 = new Node(6,null,null,null);
        n5.next = n6;
        n6.prev = n5;

        Node n7 = new Node(7,null,null,null);
        n3.child = n7;
        Node n8 = new Node(8,null,null,null);
        n7.next = n8;
        n8.prev = n7;
        Node n9 = new Node(9,null,null,null);
        n8.next = n9;
        n9.prev = n8;
        Node n10 = new Node(10,null,null,null);
        n9.next = n10;
        n10.prev = n9;

        Node n11 = new Node(11,null,null,null);
        n8.child = n11;
        Node n12 = new Node(12,null,null,null);
        n11.next = n12;
        n12.prev = n11;

        Node newNode = new Node(-1,null,null,null);
        Node start = createChainStructure(head);

        while(start != null){
            System.out.print(start.data);
            start = start.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node child;
    Node prev;
    Node(int data,Node next,Node child,Node prev){
        this.data = data;
        this.child = child;
        this.next = next;
        this.prev = prev;
    }
}