boolean hasCycle(Node head) {
Node ptr1 = head;
    Node ptr2 = head;
    while(ptr1 != null && ptr2 != null && ptr2.next != null) {
        ptr1 = ptr1.next;
        ptr2 = ptr2.next.next;
        
        if(ptr1 == ptr2)
            return true;
    }
    return false;
}
