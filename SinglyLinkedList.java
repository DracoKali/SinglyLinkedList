public class SinglyLinkedList {
	private Node head;
	public SinglyLinkedList() {
		this.head = null;
	}
	public SinglyLinkedList add(int numberber) {
		Node node = new Node(numberber);
		if(this.head == null) {
			this.head = node;
		}else {
			Node runner = this.head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = node;
		}
		return this;
	}
	public SinglyLinkedList remove() {
		Node runner = this.head;
		if(runner.next == null) {
			this.head = null;
		}else {
			while(runner.next.next != null) {
				runner = runner.next;
			}
			runner.next = null;
		}
		return this;
	}
	public SinglyLinkedList printValues() {
		Node runner = this.head;
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
		return null;
	}
	public SinglyLinkedList find(int number) {
		Node runner = this.head;
		while(runner.value != number) {
			runner = runner.next;
		}
		if(runner.value == number) {
			System.out.println("Is This Your Number? " + runner.value);
		}else {
			System.out.println("Sorry there no node with that value");
		}
		return null;
	}
	public SinglyLinkedList removeAt(int number) {
		if(this.head != null) {
			if(this.head.value == number) {
				this.head = this.head.next;
				return this;
			}else {
				Node runner = this.head;
				while(runner.next != null) {
					if(runner.next.value == number) {
						runner.next = runner.next.next;
						return this;
					}else {
						runner = runner.next;
					}
				}
			}
		}
		return this;
	}
}