package lec3;

public class reverse {


    public static void main(String[] args) {



    }

    public static Node reverseLinkedList(Node head){


        Node cur  = head.next;
        Node prev = head;

        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;

    }



    public static class Node{
        int val;
        Node next;


        public  Node(int val,Node next){
            this.val = val;
            this.next = null;
        }
    }
}


