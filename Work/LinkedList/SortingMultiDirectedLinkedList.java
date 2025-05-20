//Rotate Right Linked List by K Elements

class Solution{
    static Node sortMultiNodeLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            if (current.child != null) {
                Node childTail = current.child;
                while (childTail.next != null) {
                    childTail = childTail.next;
                }
                childTail.next = current.next;
                current.next = current.child;
                current.child = null;
            }
            current = current.next;
        }
        head = insertionSort(head);
        return head;
    }

    static Node insertionSort(Node head) {
        Node sorted = head;
        Node unsorted = head.next;
        sorted.next = null;

        while (unsorted != null) {
            Node nodeToInsert = unsorted;
            unsorted = unsorted.next;
            nodeToInsert.next = null;

            if (nodeToInsert.data < sorted.data) {
                // Insert at head
                nodeToInsert.next = sorted;
                sorted = nodeToInsert;
            } else {
                Node temp = sorted;
                while (temp.next != null && temp.next.data < nodeToInsert.data) {
                    temp = temp.next;
                }
                nodeToInsert.next = temp.next;
                temp.next = nodeToInsert;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        Node n1 = new Node(3,null,null);
        Node head = n1;
        Node n2 = new Node(2,null,null);
        n1.next = n2;
        Node n3 = new Node(1,null,null);
        n2.next = n3;
        Node n4 = new Node(4,null,null);
        n3.next = n4;
        Node n5 = new Node(5,null,null);
        n4.next = n5;

        Node n6 = new Node(4,null,null);
        n1.child = n6;
        Node n7 = new Node(6,null,null);
        n6.child = n7;
        Node n8 = new Node(7,null,null);
        n7.child = n8;

        Node n9 = new Node(3,null,null);
        n2.child = n9;
        Node n10 = new Node(5,null,null);
        n9.child = n10;

        Node n11 = new Node(5,null,null);
        n3.child = n11;
        Node n12 = new Node(7,null,null);
        n11.child = n12;

        Node n13 = new Node(5,null,null);
        n4.child = n13;
        Node n14 = new Node(6,null,null);
        n13.child = n14;
        Node n15 = new Node(8,null,null);
        n14.child = n15;
        Node n16 = new Node(11,null,null);
        n15.child = n16;

        Node n17 = new Node(7,null,null);
        n5.child = n17;

        Node start = sortMultiNodeLinkedList(head);

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
    Node(int data,Node next,Node child){
        this.data = data;
        this.child = child;
        this.next = next;
    }
}