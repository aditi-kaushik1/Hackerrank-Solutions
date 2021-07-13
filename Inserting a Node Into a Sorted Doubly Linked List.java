public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if(data < llist.data) {
            newNode.next = llist;
            return newNode;
        }
        
        DoublyLinkedListNode curr = llist;
        
        while(curr.next != null && curr.data < data) {
            curr = curr.next;
        }
        
        if(curr.next == null && curr.data < data) {
            curr.next = newNode;
            newNode.prev = curr;
            return llist;
        }
        
        curr = curr.prev;
        DoublyLinkedListNode nex = curr.next;
        curr.next = newNode;
        newNode.next = nex;
        newNode.prev = curr;
        nex.prev = newNode;
        return llist;
}
