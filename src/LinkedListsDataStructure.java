public class LinkedListsDataStructure {

    void printList(Node node)
    {
        while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }

       // initialize a linked list
       linkedListCustom initializeListAndPrint() {
           linkedListCustom l1 = new linkedListCustom();
           l1.addAtHead(1);
           l1.addAtHead(5);
           l1.addAtHead(6);
           l1.addAtHead(8);
           l1.addAtHead(2);
           l1.addAtHead(3);
           l1.addAtHead(8);
           l1.addAtHead(9);

           for (int i = 0; i < l1.size; i++) {
               System.out.print(l1.get(i));
        }
        return l1;
    }
        /** reverse link list*/
        Node reverseLinkList (Node head){
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node forw = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forw;
            }
            return prev;
        }

    }





class Node {
    Node next = null;
    int val =0;

    public Node (int val){
        this.val = val;
    }
}

//creating a custom liniked list class
class linkedListCustom {
    private Node head;
    private Node tail;
    public int size;

    /** Initialize your data structure here. */
    public linkedListCustom(){
        this.head = null;
        this.tail = null;
        this.size =0;
    }

    public Node getHead(){
        return head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index){
        if(index < 0 || index >= this.size) return -1;

        Node current =this.head;
        while (index --> 0){
            current = current.next;
        }
        return current.val;
    }

    public Node getNodeAt(int index){
        Node curr = head;
        while(index-- > 0){
            curr = curr.next;
        }

        return curr;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(this.size == 0){
            this.head = node;
            this.tail = node;
        }
        else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(this.size == 0){
            this.head = node;
            this.tail = node;
        }else
        {
            this.tail.next = null; //why do we need both this initializations here?
            node.next = null;
            this.tail = node;
        }
        this.size ++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size) return;

    if(index == 0){
        this.addAtHead(val);
    }
    else if (index == this.size){
        this.addAtTail(val);
    }
    else{
        Node prev = getNodeAt(index-1);
        Node forw = prev.next;
        Node curr = new Node(val);
        prev.next = curr;
        curr.next = forw;
        this.size ++;
    }
    }

    /** Delete the first & last node in the linked list, if the index is valid. */

    public void deleteFirst(){
        if(this.size == 0) return;
        else if(this.size == 1){
            this.head = null;
            this.tail = null;
        }
        else{
            Node curr = this.head;
            Node forw = curr.next;
            curr.next = null;
            this.head = forw;
        }
        this.size--;
    }

    public void deleteLast(){
        if(this.size == 0) return;
        else if(this.size == 1){
            this.head = null;
            this.tail = null;
        }
        else{
            Node secondLast = getNodeAt(this.size-2);
            secondLast.next = null;
            this.tail = secondLast;
        }
        this.size--;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= this.size) return;

        if(index == 0){
            deleteFirst();
        }
        else if(index == this.size-1){
            deleteLast();
        }
        else{
            Node prev = getNodeAt(index-1);
            Node curr = prev.next;
            Node forw = prev.next.next;
            prev.next = forw;
            curr.next = null;
            this.size--;
        }
    }

    public boolean isPalindrome(Node head) {
        if(head == null) return true;
        Node fast = head, slow = head;

        /** find middle element */
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        /** reverse the second half */
        Node prev = null;
        while(slow != null){
            Node temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        /** compare the first and second half */
        slow = prev;
        while(slow != null) {
            if(head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}