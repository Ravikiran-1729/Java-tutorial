public class PalindromeLinkedList {
    Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Insert at beginning
    public void addFirst(int value) {
        Node nodeToAdd = new Node(value);
        if (head == null) {
            head = nodeToAdd;
            return;
        }
        nodeToAdd.next = head;
        head = nodeToAdd;
    }

    // Print full list from head
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    // Print list from any given node
    public void printList(Node startNode) {
        if (startNode == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = startNode;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    // Get size of linked list
    public int getSize() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Find middle and check palindrome
    public void checkPalindromeFromMiddle() {
        int length = getSize();
        if (length == 0) {
            System.out.println("List is Empty");
            return;
        }

        int midIndex = 0;
        Node midNode = head;
        while (midIndex != length / 2) {
            midNode = midNode.next;
            midIndex++;
        }

        Node reversedSecondHalf = reverseRecursively(midNode);
        System.out.print("Reversed second half:");
        printList(reversedSecondHalf);

        System.out.print("Final List (unchanged first half):- ");
        printList();

        
        if (isPalindrome(reversedSecondHalf)) {
            System.out.println("List is Palindromic.");
        } else {
            System.out.println("List is NOT Palindromic.");
        }
    }

    // Reverse list recursively
    public Node reverseRecursively(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node newHead = reverseRecursively(node.next);
        node.next.next = node;
        node.next = null;

        return newHead;
    }

    // Check if list is palindrome
    public boolean isPalindrome(Node secondHalfHead) {
        Node firstHalfPointer = head;
        Node secondHalfPointer = secondHalfHead;

        while (firstHalfPointer != null && secondHalfPointer != null) {
            if (firstHalfPointer.value != secondHalfPointer.value) {
                System.out.println("List isn't palindromic " + firstHalfPointer.value + " " + secondHalfPointer.value);
                return false;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList palindromeList = new PalindromeLinkedList();

        palindromeList.addFirst(1);
        palindromeList.addFirst(2);
        palindromeList.addFirst(3);
        palindromeList.addFirst(2);
        palindromeList.addFirst(1);

        System.out.print("Original List:- ");
        palindromeList.printList();
        System.out.println("Size of LinkedList :- " + palindromeList.getSize());

        palindromeList.checkPalindromeFromMiddle();

    }
}
