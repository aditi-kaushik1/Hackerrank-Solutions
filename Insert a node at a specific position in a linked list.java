public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(llist == null) 
            return newNode;
        SinglyLinkedListNode curr = llist;
        if(position == 0) {
            newNode.next = llist;
            return newNode;
        }
        while(position != 1) {
            curr = curr.next;
            position--;
        }
        SinglyLinkedListNode nex = curr.next;
        curr.next = newNode;
        newNode.next = nex;
        return llist;
}
