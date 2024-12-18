
// Definition for a Node.
// class Node {
//     public int val;
//     public Node prev;
//     public Node next;
// };

class Solution {
    public int[] toArray(Node head) {
        Node temp = head;
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        return arr;
    }
}