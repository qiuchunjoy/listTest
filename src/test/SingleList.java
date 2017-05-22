package test;
 
/**
 * ������
 * @author sd
 *
 */
public class SingleList {
    private Node_Single head = null;//ͷ�ڵ�
    private Node_Single tail = null;//β�ڵ�(�սڵ�)�൱���ڱ�Ԫ��
 
    /**
     * ��ʼ��һ����������head ��
     * @param key
     */
    public void initList(Node_Single node){
        head  = node;
        head.next = tail;
    }
     
    /**
     * ���һ��Ԫ��
     * @param node
     */
    public void addTolist(Node_Single node){
        if(head == null){
            initList(node);
        }else{
            Node_Single tmp = head;
            head = node;
            node.next = tmp;
        }
    }
     
    /**
     * ��������ɾ��ĳһ���ڵ�
     * @param node
     * @param myList
     */
    public void deleteNode(Node_Single node,SingleList myList){
        if(myList == null){
            return ;
        }
        Node_Single tmp =null;
        for(tmp = myList.getHead();tmp!=null;tmp = tmp.next){
            if(tmp.next !=null && node.getKey().equals(tmp.next.getKey())){//��Ԫ�غͺ�һ��Ԫ����ͬ��ָ��ָ����һԪ�ص���һԪ��
                if(tmp.next.next != null){
                    tmp.next = tmp.next.next;
                }else{
                    tmp.next = null;
                }
            }
        }
    }
     
    public void printList(SingleList myList){
        Node_Single tmp =null;
        for(tmp = myList.getHead();tmp!=null;tmp = tmp.next){
            System.out.println(tmp.getKey());
        }
    }
     
    public Node_Single getHead() {
        return head;
    }
    public void setHead(Node_Single head) {
        this.head = head;
    }
    public Node_Single getTail() {
        return tail;
    }
    public void setTail(Node_Single tail) {
        this.tail = tail;
    }
    public static void main(String[] args){
        SingleList myList = new SingleList();
        Node_Single node_1 = new Node_Single("1");
        Node_Single node_2 = new Node_Single("2");
        Node_Single node_3 = new Node_Single("3");
        Node_Single node_4 = new Node_Single("4");
        Node_Single node_5 = new Node_Single("5");
        Node_Single node_6 = new Node_Single("6");
        Node_Single node_7 = new Node_Single("7");
        myList.addTolist(node_1);
        myList.addTolist(node_2);
        myList.addTolist(node_3);
        myList.addTolist(node_4);
        myList.addTolist(node_5);
        myList.addTolist(node_6);
        myList.addTolist(node_7);
        //myList.deleteNode(node_3, myList);
        myList.printList(myList);
    }
     
}