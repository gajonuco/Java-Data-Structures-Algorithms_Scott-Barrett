public class LinkedList {
    
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        //Create a new node with the given value
        Node newNode = new Node(value);

        //Set thsi new node as both the head and tail pf the linked list
        

}
