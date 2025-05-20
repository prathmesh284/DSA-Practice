//Add 2 Linked List

class Solution{
    static Node addLinkedList(Node start1,Node start2){
        Node res = new Node(-1, null),ans = res;
        Node temp1 = start1 ,temp2 = start2;
        int carry = 0;
        while(temp1 != null ||temp2 != null || carry == 1){
            int sum = 0;
            if(temp1 != null){
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                sum += temp2.data;
                temp2 = temp2.next;
            }
            sum += carry;
            Node node = new Node(sum%10, null);
            ans.next = node;
            ans = ans.next;
            carry = sum/10;
        }
        return res.next;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1,null);
        Node head1 = n1;
        Node n2 = new Node(2,null);
        n1.next = n2;
        Node n3 = new Node(5,null);
        n2.next = n3;
        Node n4 = new Node(4,null);
        Node head2 = n4;
        Node n5 = new Node(5,null);
        n4.next = n5;
        Node n6 = new Node(6,null);
        n5.next = n6;

        Node start = addLinkedList(head1,head2);

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