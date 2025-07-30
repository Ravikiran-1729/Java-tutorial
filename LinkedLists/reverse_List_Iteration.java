public class reverse_List_Iteration{
    Node head;
    class Node{
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



    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }


    public static void main(String[] args) {
        temp list = new temp();
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.printList();
        list.reverseIterate();
        list.printList();
        list.reverseIterate();
        list.printList();
    }  
}