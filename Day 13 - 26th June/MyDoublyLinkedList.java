public class MyDoublyLinkedList {
    // Node structure with data, prev, and next pointers
    private static class Node {
        String data;
        Node prev, next;
        Node(String d) { data = d; }
    }

    private Node head, tail;

    public void addFirst(String data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public void addLast(String data) {
        Node n = new Node(data);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    public String removeFirst() {
        if (head == null) return null;
        String val = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        return val;
    }

    public String removeLast() {
        if (tail == null) return null;
        String val = tail.data;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        return val;
    }

    public void traverseForward() {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }

    public void traverseBackward() {
        for (Node cur = tail; cur != null; cur = cur.prev) {
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyDoublyLinkedList dll = new MyDoublyLinkedList();
        dll.addFirst("Apple");
        dll.addLast("Mango");
        dll.addFirst("Grapes");
        dll.addLast("Orange");

        System.out.print("Forward: ");
        dll.traverseForward();      // Grapes Apple Mango Orange
        System.out.print("Backward: ");
        dll.traverseBackward();     // Orange Mango Apple Grapes

        dll.removeFirst();          // removes Grapes
        dll.removeLast();           // removes Orange

        System.out.print("After removals, Forward: ");
        dll.traverseForward();      // Apple Mango
    }
}
