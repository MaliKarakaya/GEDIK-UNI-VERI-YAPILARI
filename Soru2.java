package ders9;

public class Soru2 {
   public static void main(String[] args) {
      // Decimal bir sayıyı, binary bir sayıya çeviren Java kodunu
      // Stack veri yapısını kullanarak yazınız.
      MyStack ms = new MyStack();

      int bolum = 13;
      while (bolum >= 2) {
         ms.push(bolum % 2);
         bolum = bolum / 2;
      }

      ms.push(bolum);

      while (!ms.isEmpty()) {
         System.out.print(ms.pop());
      }

      System.out.println("");
   }
}

class MyStack {
   Dugum head;

   public boolean isEmpty() {
      return (head == null);
   }

   public void push(int data) {
      Dugum yeniNode = new Dugum(data);

      if (isEmpty()) {
         head = yeniNode;
      } else {
         yeniNode.next = head;
         head = yeniNode;
      }
   }

   public int pop() {
      if (isEmpty()) {
         return -1;
      } else {
         int temp = head.data;
         head = head.next;

         return temp;
      }
   }
}

class Dugum {
   int data;  // yığındaki veri türü integer olacak
   Dugum next;

   public Dugum(int data) {
      this.data = data;
      this.next = null;
   }
}
