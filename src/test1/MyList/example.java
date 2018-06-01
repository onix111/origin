

package test1.MyList;

class Node {
    public int n;
    public Node nextNode;
    
    
}

class Container {
    public Node head;
    public Node tail;
    
    public void addFirst(int value) {
        Node node = new Node();
        node.n = value;
        
        if (tail == null) {
            head = node;
            tail = head;
        }
        else {
            node.nextNode = head;
            head = node;
        }
    }
    
    public void addLast(int value){
        Node node = new Node();
        node.n = value;
        
        if(tail == null){
            head = node;
            tail = node;
        }
        else {
            tail.nextNode = node;
            tail = node;
        }
    }
    
    public void addMiddle(int value, int index){
        Node node = new Node();
        node.n = value;
        int count = 0;
        Node temp = head;
        
        while(count < index-1){
            temp = temp.nextNode;
            count++;
        }
    }
}

public class example {
    
}
