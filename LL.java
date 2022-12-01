public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
            return;
        }

        new_Node.next = head;
        head = new_Node;
    }

    public void addLast(int data) {
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new_Node;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        LL list = new LL();

        list.addFirst(5);
        list.printList();
        list.addLast(8);
        list.printList();
        // list.deleteFirst();
        list.deleteLast();
        list.printList();

    }
}
