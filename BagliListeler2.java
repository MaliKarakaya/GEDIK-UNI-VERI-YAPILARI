package ders7;

public class BagliListeler2 {
   public static void main(String[] args) {
      BagliListe2 liste = new BagliListe2();

      liste.listele();

      liste.basaEkle(10);
      liste.basaEkle(20);
      liste.basaEkle(30);
      liste.basaEkle(40);
      liste.listele();

      liste.sonaEkle(50);
      liste.sonaEkle(60);
      liste.sonaEkle(70);
      liste.listele();
   }

}

class BagliListe2 {
   Node2 head, tail;

   public BagliListe2() {
      head = null;
      tail = null;
   }

   public void basaEkle(int data) {
      Node2 yeniNode = new Node2(data);

      if (head == null) { // Listeye eklenen düğüm, ilk düğüm ise
         head = yeniNode;
         tail = yeniNode;
      } else {
         yeniNode.next = head;
         head = yeniNode;
      }
   }

   public void sonaEkle(int data) {
      Node2 yeniNode = new Node2(data);

      if (tail == null) { // Listeye eklenen düğüm, ilk düğüm ise
         head = yeniNode;
         tail = yeniNode;
      } else {
         tail.next = yeniNode; // Eski son düğüm, yeni eklenen düğümü göstermelidir.
         tail = yeniNode;
      }
   }

   public void listele() {
      if (head == null) {
         System.out.println("Liste boş!");
      } else {
         System.out.println("----------");
         Node2 temp = head;
         while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
         }
         System.out.println("----------");
      }
   }

}

class Node2 {
   int data;
   Node2 next;

   public Node2(int data) {
      this.data = data;
      this.next = null;
   }
}
