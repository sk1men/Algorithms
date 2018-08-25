package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Node {

    Node next = null;
    int data = 0;

    public Node(int data) {
        this.data = data;
    }

    public void appendNodeAfter(int data) {
        Node nextNode = new Node(data);
        this.next = nextNode;
    }

    public void appendNodeToEnd(int data) {
        Node end = new Node(data);
        Node currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = end;
    }

    public Node deleteNode(Node head, int data) {
        Node node = head;
        if (node.data == data) {
            return head.next; /* moved head */
        }

        while (node.next != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
                return head; /* head didn't change */
            }
            node = node.next;
        }
        return head;
    }

    public static void main(String[] arg) {

        Node node = new Node(1);
        node.appendNodeToEnd(2);
        node.appendNodeToEnd(2);
        node.appendNodeToEnd(3);
        node.appendNodeToEnd(2);
        node.appendNodeToEnd(1);

        System.out.println(node);

        Node result = deleteDublicateFromList(node);
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    private static Node deleteDublicateFromList(Node head) {

        if (head == null) return null;
        Set<Integer> unique = new HashSet<Integer>();

        Node prevNode = head;
        Node currentNode = head.next;

        unique.add(head.data);
        while (currentNode != null) {
            if (!unique.contains(currentNode.data)) {
                unique.add(currentNode.data);
                prevNode = currentNode;
            } else {
                prevNode.next = currentNode.next;
            }
            currentNode = currentNode.next;
        }

        return head;
    }
}



