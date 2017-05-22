package test;
 
/**
 * 单链表 节点
 * @author sd
 *
 */
public class Node_Single {
    public String key;//节点的值
     
    public Node_Single next;//指向下一个的指针
 
    public Node_Single(String key){//初始化head
        this.key = key;
        this.next = null;
    }
    public Node_Single(String key,Node_Single next){
        this.key = key;
        this.next = next;
    }
    public String getKey() {
        return key;
    }
 
    public void setKey(String key) {
        this.key = key;
    }
 
    public Node_Single getNext() {
        return next;
    }
 
    public void setNext(Node_Single next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "Node_Single [key=" + key + ", next=" + next + "]";
    }
 
     
     
     
}