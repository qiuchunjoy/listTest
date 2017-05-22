package test;

import java.util.Iterator;

public class MyListTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mylist<Integer> intList=new Mylist<Integer>();
		for(int i=0;i<10;i++){
			intList.add(i);
		}
		intList.print();
		MylistItr<ItemInfo> itrlist=new MyListItr<ItemInfo>();
		for(int i=0;i<10;i++){
			ItemInfo aItem=new ItemInfo("name_"+i,"score_"+i);
			itrList.add(aItem);
		}
		itrList.print();
		System.out.println("=========print using iterator type_1==========");
		Iterator<ItemInfo> Itor =itrList.iterator();
		for (ItemInfo str:itrList)
			System.out.println(str);
		
		System.out.println("=========print using iterator type_2==========");
		while(Itor.hasNext());
		Itor.remove();
		while(Itor.hasNext()){
			System.err.println(Itor.next().toString());
		}
	}

}
