// 2. Remove Zero Sum Consecutive Nodes from Linked List

class Solution {
    static void printLinkNode(Node head){
        Node start = head;
        while(start != null){
            System.out.print(start.data+" ");
            start = start.next;
        }
        System.out.println();
    }

    static void zeroSumConsecutive(Node start,Node prev){
        Node current = start;
        if(current.next == null){
            return;
        }
        int sum = 0;
        while(current.next != null){
            sum += current.data;
            current = current.next;
            if(sum == 0) {
                prev.next = current;
                return;
            }
        }
        zeroSumConsecutive(start.next,start);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1,null);
        Node head = n1;
        Node n2 = new Node(2,null);
        n1.next = n2;
        Node n3 = new Node(-3,null);
        n2.next = n3;
        Node n4 = new Node(3,null);
        n3.next = n4;
        Node n5 = new Node(1,null);
        n4.next = n5;

        printLinkNode(head);                        //Print LinkNode

        Node prev = new Node(0,null);
        zeroSumConsecutive(head,prev);

        printLinkNode(prev); 
    }
}

class Node {
    int data;
    Node next;
    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}