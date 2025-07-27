// public class DeclarationLL {
//     Node head;

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addfirst(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addlast(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node curNode = head;
//         while (curNode != null) {
//             curNode = curNode.next;
//         }
//         curNode.next = newNode;
//     }

//     public void printlist() {
//         if(head == null){
//             System.out.println("List is Empty");
//             return;
//         }
//         Node curNode = head;
//         while (curNode == null) {
//             System.out.print(curNode.data + " -> ");
//             curNode = curNode.next;
//         }
//     }

//     public static void main(String[] args) {
//         DeclarationLL list = new DeclarationLL();
//         list.addfirst("a");
//         list.addfirst("list");
//         list.printlist();
//     }
// }
class DeclarationLL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode == null){
            System.out.print(currNode+" -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        DeclarationLL list = new DeclarationLL();
        list.addfirst("a");
        list.printlist();
        list.addfirst("is");
        list.printlist();
        list.addfirst("This");
        list.printlist();
        list.addlast("list");
        list.printlist();
    }
     
}