public class main {

	public static void main(String[] args) {
		SList<String> s = new SList<String>();
		s.insertFront("orange"); s.insertFront("apple");
		s.insertAfet("cherry", s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println();
		System.out.println(": s�� ���� = " + s.size() + "\n");
		System.out.println("ü���� \t" + s.search("cherry") + "��°�� �ִ�.");
		System.out.println("Ű���� \t" + s.search("kiwi") + "��°�� �ִ�.");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s�� ����= " + s.size()); System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s�� ����= " + s.size()); System.out.println();
		
		SList<Integer> t = new SList<Integer>();
		t.insertFront(500); t.insertFront(200);
		t.insertAfet(400, t.head);
		t.insertFront(100);
		t.insertAfet(300, t.head.getNext());
		t.print();
		System.out.println(": t�� ���� = " + t.size());
	}
}
