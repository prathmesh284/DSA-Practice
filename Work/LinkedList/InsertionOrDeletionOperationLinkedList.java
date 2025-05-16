//Insertion and Deletion of Nodes in Linked List
class Solution{
    static void insertNode(int index,Node data,Node current){
        Node previousNode = current;
        Node nextNode = current.next;
        if(index == 1){
            data.next = nextNode;
            previousNode.next = data;
            return;
        }
        insertNode(index-1,data,nextNode);
    }

    static void deleteNode(int index,Node current){
        Node previousNode = current;
        Node nextNode = current.next;
        if(index == 1){
            previousNode.next = nextNode.next;
            nextNode.next = null;
            return;
        }
        deleteNode(index-1,nextNode);
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

        System.out.println("After Insertion at index 4:");
        Node newNode = new Node(10,null);     
        insertNode(4, newNode, head); 
        start = head; 
        while(start != null){
            System.out.print(start.data);
            start = start.next;
        }
        System.out.println();

        System.out.println("After Deletion at index 3:");
        deleteNode(3,head);
        start = head; 
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