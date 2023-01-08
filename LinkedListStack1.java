package ders9;

public class LinkedListStack1 {
   public static void main(String[] args) {
      LListStack ls = new LListStack();

      ls.push("istanbul");
      ls.push("ankara");
      ls.push("izmir");

      System.out.println("yığına en son eklenen: " + ls.peek());

      ls.pop();
      ls.pop();
      ls.pop();
      ls.pop();
   }
}

class LListStack {
   Node head;

   public boolean isEmpty() {
      return (head == null);
   }

   public void push(String data) {
      Node yeniNode = new Node(data);

      if (isEmpty()) {
         head = yeniNode;
      } else {
         yeniNode.next = head;
         head = yeniNode;
      }
   }

   public String pop() {
      if (isEmpty()) {
         System.out.println("Liste zaten boş!");
         return null;
      } else {
         String temp = head.data;
         head = head.next;

         return temp;
      }
   }

   public String peek() {
      if (isEmpty()) {
         System.out.println("Liste zaten boş!");
         return null;
      } else {
         return head.data;
      }
   }
}

class Node {
   String data; // yoğındaki veri türü String olacak.
   Node next;

   public Node(String data) {
      this.data = data;
      this.next = null;
   }
}
