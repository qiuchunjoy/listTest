package test;

public class ItemInfo {
	String name;
	String score;
	public ItemInfo(String n,String s){
		name=n;score=s;
	}
	public ItemInfo(){
		name=null;score=null;
	}
	public String toString(){
		String str=name +" "+score;
		return str;
	}
}
