public class reverseLinkedList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the end
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // Reverse the linked list
    public void reverseLinkedList() {

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next;

            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head = prevNode;
    }

    public static void main(String[] args) {

        reverseLinkedList list = new reverseLinkedList();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        System.out.println("Original Linked List:");
        list.printList();

        list.reverseLinkedList();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}