
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution {
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node result = null;
     if(head1 == null) return head2;
     if(head2 == null) return head1;
     
     if(head1.data <= head2.data){
         result = head1;
         result.next = sortedMerge(head1.next, head2);
     }
     else{
         result = head2;
         result.next = sortedMerge(head1, head2.next);
     }
     
     return result;
   } 
}