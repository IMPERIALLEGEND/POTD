class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }
}
class Solution {
    Node reverseList(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        
        Node Prev = null;
        Node Curr = head;
        Node Next = head;
        
        while(Curr != null){
            Next = Curr.next;
            Curr.next = Prev;
            Prev = Curr;
            Curr = Next;
        }
        
        return Prev;
        
    }
}