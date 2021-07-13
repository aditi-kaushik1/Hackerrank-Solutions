/* Given the pointer to the head node of a doubly linked list, reverse the order of the nodes in place. T
hat is, change the next and prev pointers of the nodes so that the direction of the list is reversed. Return a reference to the head node of the reversed list.
Note: The head node might be NULL to indicate that the list is empty. */

public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        if(llist == null)
            return null;
        DoublyLinkedListNode curr = llist;
        DoublyLinkedListNode newHead = llist;
        while(curr != null) {
            DoublyLinkedListNode newPrev = curr.prev;
            curr.prev = curr.next;
            curr.next = newPrev;
            newHead = curr;
            
          //Because next and prev have been swapped.
            curr = curr.prev;
        }
        return newHead;
}
