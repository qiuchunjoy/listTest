package test;
 
/**
 * ������ �ڵ�
 * @author sd
 *
 */
public class Node_Single {
    public String key;//�ڵ��ֵ
     
    public Node_Single next;//ָ����һ����ָ��
 
    public Node_Single(String key){//��ʼ��head
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