package collection.test;

class Node {
	private int data;
	private Node next;
	
	public Node() {
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}

class MyLinkedList{
	private Node head;
	private Node tail;
	
	public void addNode(int num) {
		Node bmp = new Node(num,null);
		if(head==null) {
			head = bmp;
		}else {
			tail.setNext(bmp); //현재 꼬리값에 다음값으로 이걸 연결시켜주고
		}
		tail = bmp; //현재값을 마지막으로 새로 갱신함
	}
	
	public void printNode() {
		Node cur = head; //current 주소값에 head 시작점의 주소값을 할당
		while(cur != null) {
			System.out.print(cur.getData()+" ");
			cur = cur.getNext(); //다음 주소값을 새로 할당
		}
	}
	
	public void updateNode(int data, int newData) {
		Node cur = head;
		while(cur != null) {
			if(cur.getData() == data) { //위치찾기
				cur.setData(newData);
			}else { //위치 못찾으면
			cur = cur.getNext();
			}
		}
	}
	
	public void deleteNode(int data) {
		Node cur = head;
		Node before = null;
		while(cur != null) {
			if(cur.getData() == data) { //위치찾기
				if(cur.equals(head)) {  //첫번째면
					head = cur.getNext();
				}else if(cur.equals(tail)) { //마지막이면면
					tail = before;
					before.setNext(null);
					cur = null;
				}else if(before != null) {//첫번째나 마지막이 아니면
					before.setNext(cur.getNext());
					cur = cur.getNext();
				}
			}else { //위치 못찾으면
			before = cur;
			cur = cur.getNext();
			}
		}
	}
	
}

public class LinkedListTest {

	public static void main(String[] args) {
		MyLinkedList ld = new MyLinkedList();
		
		for(int i=1; i<10; i++) {
			ld.addNode(i);
		}
		
		ld.printNode();
		
		System.out.println("\n 데이터 3값을 가진 항목을 6으로 바꾼 결과 ------------");
		ld.updateNode(3,6);
		ld.printNode();
		
		System.out.println("\n 데이터 6값을 가진 항목 2개를 모두 삭제한 결과 ------------");
		ld.deleteNode(6);
		ld.printNode();
	}

}
