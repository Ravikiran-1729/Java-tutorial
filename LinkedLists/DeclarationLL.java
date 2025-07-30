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
        // list.addfirst("a");
        // list.printlist();

        // list.addfirst("is");
        // list.printlist();
        // list.addfirst("This");
        // list.printlist();
        // list.addlast("list");
        // list.printlist();
        // // list.deletefirst();
        // // list.printlist();
        // // list.deletelast();
        // // list.printlist();
        // list.deleteelement(4);
        // list.printlist();

        list.addlast("1");
        list.addlast("2");
        list.addlast("3");
        list.addlast("4");
        list.printlist();
        list.reverseIterate();
        list.printlist();
    }

    public void deletefirst() {

        if (head == null) {
            System.err.println("List is Empty");
            return;
        }
        head = head.next;
    }

    public void deletelast() {

        if (head == null) {
            System.err.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        while ((currNode.next).next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public void deleteelement(int idx) {

        Node currNode = head;
        if (idx == 0) {
            head = currNode.next;
            return;
        }

        for (int i = 1; i < idx; i++) {
            currNode = currNode.next;
            if (currNode.next == null) {
                System.err.println("idx Out of Bound");
                return;
            }
        }

        currNode.next = (currNode.next).next;
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