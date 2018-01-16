public class Node{
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
    public void setValue(int value){
        this.value = value;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(20).add(47).add(106).add(9).add(17);

        sll.printValues();
        sll.removeAt(9);
        sll.printValues();

    }
}