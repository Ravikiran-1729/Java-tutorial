public class doublylinkedlist {
    Node head;
    class Node{
        Integer data;
        Node prev;
        Node next;

        Node(Integer data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addlast(Integer data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next !=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode.next !=null){
            System.out.print(currNode.data+" <-> ");
            currNode = currNode.next;
        }
        System.out.print(" Null");

    }
    public static void main(String[] args) {
        doublylinkedlist list = new doublylinkedlist();

        list.addlast(1);    
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.printlist();

    }
}
