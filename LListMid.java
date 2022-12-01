
public class LListMid {

    // public static String reverseString(String str,int n){
    // String str2 = "";
    // for(int i=n-1; i >= 0 ; i--){
    // str2 += str.charAt(i);
    // }
    // return str2;
    // }

    // public static void main(String[] args) {
    // String str = "sachin";
    // int n = str.length();
    // System.out.println(reverseString(str,n));
    // }
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
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

    public void printList() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public int getLength() {
        int count = 0;
        if (head == null) {
            return count;
        }
        Node currNode = head;

        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        return count;
    }

    public void printMiddle() {
        if (head != null) {
            int len = getLength();
            Node newNode = head;
            int mid = len / 2;
            while (mid != 0) {
                newNode = newNode.next;
                mid--;
            }
            System.out.print("Mid is " + newNode.data);
        }
    }

    public static void main(String[] args) {
        LListMid list = new LListMid();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        System.out.println("");
        list.printMiddle();
    }
}