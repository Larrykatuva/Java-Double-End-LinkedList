
public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLastLinkedList lk = new FirstLastLinkedList();
		
		lk.insertFirst(33, 40);
		lk.insertFirst(78, 67);
		lk.insertLast(100, 100);
		lk.insertLast(90, 677);
		lk.insertFirst(78, 89);
		
		lk.displayList();
		System.out.println("\n");
		lk.deleteFirst().displayLink();
		System.out.println("\n");
		lk.displayList();

	}

}
