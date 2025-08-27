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

    public Node reverse_recursively(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newNode = reverse_recursively(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
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
        reverse_List_Iteration list = new reverse_List_Iteration();
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.printList();
        list.reverseIterate();
        list.printList();
        list.head = list.reverse_recursively(list.head);
        list.printList();
    }  
}