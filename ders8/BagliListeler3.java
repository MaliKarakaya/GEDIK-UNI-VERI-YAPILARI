package ders8;

public class BagliListeler3 {
   // Bağlı listede silme metodları
   public static void main(String[] args) {
      BagliListe3 liste = new BagliListe3();
      liste.basaEkle(10);
      liste.basaEkle(20);
      liste.basaEkle(30);
      liste.basaEkle(40);
      liste.listele();

      liste.sil(30);
      liste.listele();

      liste.bastanSil();
      liste.listele();
   }
}

class BagliListe3 {
   Node3 head;

   public void basaEkle(int data) {
      Node3 yeniNode = new Node3(data);

      if (head == null) {
         head = yeniNode;
      } else {
         yeniNode.next = head;
         head = yeniNode;
      }
   }

   public void bastanSil() {
      if (head == null) {
         System.out.println("Liste zaten boş!");
      } else {
         head = head.next;
      }
   }

   public void sil(int data) {
      Node3 onceki = null;
      Node3 temp = head;

      if (head == null) {
         System.out.println("Liste zaten boş!");
      } else if (head.data == data) {
         head = head.next;
      } else {          // kod buraya geldiyse, en az 2. düğümdeyiz demektir.
         onceki = head;
         while (temp != null) {
            if (temp.data == data) {
               onceki.next = temp.next;
               break;
            }

            onceki = temp;
            temp = temp.next;
         }
      }
   }

   public void listele() {
      if (head == null) {
         System.out.println("Liste boş!");
      } else {
         System.out.println("--------");
         Node3 temp = head;
         while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
         }
      }
   }
}

class Node3 {
   int data;
   Node3 next;

   public Node3(int data) {
      this.data = data;
      this.next = null;
   }
}
