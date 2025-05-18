//Check Linked List is Recursive or not.
//By Recursive approach

// class Solution{
//     static Node current;
//     static boolean isRecursive(Node start,Node head){
        
//         if(start == null){
//             current = head;
//             return true;
//         }
//         else if(isRecursive(start.next,head) == false) return false;
//         if(current.data == start.data){
//             current = current.next;
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Node n1 = new Node(1,null);
//         Node head = n1;
//         Node n2 = new Node(2,null);
//         n1.next = n2;
//         Node n3 = new Node(3,null);
//         n2.next = n3;
//         Node n4 = new Node(2,null);
//         n3.next = n4;
//         Node n5 = new Node(1,null);
//         n4.next = n5;
//         System.out.print(isRecursive(head,head));
//     }
// }
// class Node{
//     int data;
//     Node next;
//     Node(int data,Node next){
//         this.data = data;
//         this.next = next;
//     }
// }




//By Iterative approach
class Solution{
    static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node prevNode = null;
        Node temp = slow.next;
        while(temp != null){
            Node front = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = front;
        }
        temp = head;
        while(prevNode != null){
            if(temp.data == prevNode.data){
                temp = temp.next;
                prevNode = prevNode.next;
            }else{
                return false;
            }
        }
        return true;
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
        System.out.print(isPalindrome(head));
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