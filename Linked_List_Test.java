
public class Linked_List_Test {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		System.out.println("(1)����� ���3�� ����");
		L.insertLastNode("��");
		L.insertLastNode("��");
		L.insertLastNode("��");
		L.printList();
		System.out.println("(2)�� ��� �� �� ����");
		ListNode pre = L.searchNode("��");
		if(pre == null)
			System.out.println("�˻�����");
		else {
			L.insertMiddleNode(pre, "��");
			L.printList();
		}
		
		System.out.println("(3)����Ʈ�� ��带 �������� �ٲٱ�");
		L.reverseList();
		L.printList();
		
		System.out.println("(4)����Ʈ�� ������ ��� �����ϱ�");
		L.deleteLastNode();
		L.printList();
	}

}
