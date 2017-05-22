package test;

public class Mylist<AnyType> {
	private class Node<AnyType>{
		public Node<AnyType> pre;
		public Node<AnyType> next;
		public AnyType data;
		public Node(AnyType d,Node<AnyType> p,Node<AnyType> n){
			
		}
		public Node(){
			
		}
		private int theSize;
		private Node<AnyType> Header;
		private Node<AnyType> Tail;
		public void MyList(){
			theSize=0;
			Header=new Node<AnyType>(null,null,null);
			Tail=new Node<AnyType>(null,Header,null);
			Header.next=Tail;
		}
		public void add (AnyType item){
			Node<AnyType> aNode=new Node<AnyType>(item,null,null);
			Tail.pre.next=aNode;
			aNode.pre=Tail;
			Tail.pre=aNode;
			theSize++;
		}
		public boolean isEmpty(){
			return (theSize==0);
			
		}
		public int size(){
			return theSize;
		}
		public AnyType get(int idx){
			if(idx>theSize-1||idx<0)
				throw new IndexOutOfBoundsException();
				Node<AnyType> current=new Node<AnyType>(null,Header,null);
				for(int i=0;i<idx;i++)
					current=current.next;
				return current.data;
			
		}
		public void print(){
			Node<AnyType> current=Header.next;
			while(current.next!=null){
				//如果AnyType是你自己定义 //的数据类型，那么请务必提供
				//一个toString方法，要么就不
				//要在链表里实现print方法
				System.out.println(current.data.toString());
				current=current.next;
			}
		}
	}


}
