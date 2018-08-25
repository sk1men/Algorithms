package Stack;

public class Stack {

    StackNode head = null;

    public void push(int value) {
            head = new StackNode(head, value);
    }

    public int pull(){
        int value = 0;
        if(head != null) {
            value = head.value;
            head = head.next;
        }
        return value;// запитати що повертати коли немає
    }


}

class StackNode {
    StackNode next;
    int value;

    public StackNode(StackNode next, int value) {
        this.next = next;
        this.value = value;
    }
}
