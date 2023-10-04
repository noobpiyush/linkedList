package lec1;


public class linkedListImplementation {

    public static void main(String[] args) {

        Node<Integer> head = new Node<Integer>(5);

        Node<Integer> n1 = new Node<>(4);

        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(33);
        Node<Integer> n4 = new Node<>(34);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        head = insertInLinkedList(head, 56, 0);

       head= deletionInLinkedList(head,0);

        printLinkedList(head);

    }

    public static void printLinkedList(Node<Integer> head) {

        Node<Integer> cur = head;

        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println();


    }

    public static Node<Integer> deletionInLinkedList(Node<Integer> head,int pos){

        Node<Integer> cur = head;

        if (pos == 0){
            return head.next;
        }

        for (int i = 0; i < pos-1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;

        return head;

    }


    public static Node<Integer> insertInLinkedList(Node<Integer> head, int val, int pos) {


        Node<Integer> cur = head;
        Node<Integer> temp = new Node<>(val);

        if (pos == 0) {
            temp.next = head;
            head.prev = temp;

            return temp;

        }

        for (int i = 0; i < pos - 1; i++) {
            cur = cur.next;
        }
        temp.next = cur.next;
//        temp.next.prev =
        return head;

    }

    public static class Node<E> {
        E val;
        Node<E> next;
        Node<E> prev;
        public Node(E val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
}
