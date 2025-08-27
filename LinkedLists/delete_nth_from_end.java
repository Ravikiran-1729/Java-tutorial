public class delete_nth_from_end {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.print(" NULL");
    }

    public int size(){
        if(head == null){
            return 0;
        }
        int n = 1;
        Node curNode = head;
        while (curNode.next != null) {  
            n += 1;
            curNode = curNode.next;
        }
        return n;
    }

    public void delete_from_last(int nl){
        if(head.next == null){
            return;
        }
        int nf = size()-nl;
        int i = 1;
        Node prevNode = head;
        while (prevNode.next != null && i != nf) {
            i++;
            prevNode=prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        return;
    }
    
    public static void main(String [] args){
        delete_nth_from_end List = new delete_nth_from_end();

        List.addfirst(1);
        List.addfirst(2);
        List.addfirst(3);
        List.addfirst(4);
        List.addfirst(5);
        List.printList();

        int size = List.size();
        System.out.println("\nSize of LinkedList :- "+size);
        List.delete_from_last(3);
        System.out.println("LinkedList after delete nth from end :- ");
        List.printList();
    }
}

