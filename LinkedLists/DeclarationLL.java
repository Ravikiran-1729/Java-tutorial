class DeclarationLL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        
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
        // list.deletefirst();
        // list.printlist();
        // list.deletelast();
        // list.printlist();
        list.deleteelement(4);
        list.printlist();
    }

    public void deletefirst(){
        
        if(head == null){
            System.err.println("List is Empty");
            return;
        }
        Node currNode = head;
        head = currNode.next;
    }

    public void deletelast(){
        Node currNode = head;
        while((currNode.next).next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public void deleteelement(int idx){
        
        Node currNode = head;
        if(idx == 0){
            head = currNode.next;
            return;
        }

        for(int i = 1; i<idx; i++){
            currNode = currNode.next;
            if(currNode.next == null){
                System.err.println("idx Out of Bound");
                return;
            }
        }

        currNode.next = (currNode.next).next;
    }

}