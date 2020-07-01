package LinkedList;

public class LLclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		GenericLinkedList<Integer> list = new GenericLinkedList<Integer>();
		list.addFirst(10);
		list.display();
		list.addFirst(20);
		list.display();
		list.addLast(30);
		list.display();
		list.addLast(40);
		list.display();
		list.addAt(3, 50);
		list.display();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.getAt(2));
		list.removeAt(3);
		list.display();
		list.removeFirst();
		list.removeLast();
		list.addFirst(40);
		list.addLast(50);
		list.addLast(20);
		list.display();
		System.out.println(list.find(50));
//		list.reverseData();
//		list.display();
//		list.reversePointers();
//		list.display();
//		System.out.println(list.midElement());

	}

}
