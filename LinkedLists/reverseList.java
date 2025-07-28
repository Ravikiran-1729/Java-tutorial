public class reverseList {
    Node head;

    public class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(Integer data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printlist(){
        if(head == null){
            System.out.println("Empty");;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    
    public static void main(String[] args) {
        reverseList list = new reverseList();
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.printlist();
        list.reverseIterate();
        list.printlist();

    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = prevNode.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

        
    }
}
