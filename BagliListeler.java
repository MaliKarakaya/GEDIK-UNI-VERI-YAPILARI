package ders7;

public class BagliListeler {
   public static void main(String[] args) {
      BagliListe liste = new BagliListe();

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

class BagliListe {
   Node head;

   public BagliListe() {
      head = null;
   }

   public void basaEkle(int data) {
      Node yeniNode = new Node(data);

      if (head == null) { // Linkedlist'te hiç düğüm yoksa bu kısım çalışır.
         head = yeniNode;
      } else {            // LinkedList'te daha önceden eklenmiş düğüm varsa bu kısım çalışır.
         // Bu satırdaki head, eski baş düğümü gösteriyor.
         // Yeni eklenen düğüm, listenin başına eklendiği için,
         // yeni eklenen düğüm, eski baş düğümü göstermelidir. (next -> eski)
         yeniNode.next = head;

         // Bu satırdaki head, yeni eklenen düğümü, baş düğüm yapıyor.
         head = yeniNode;
      }
   }

   public void sonaEkle(int data) {
      Node yeniNode = new Node(data);

      if (head == null) { // Linkedlist'te hiç düğüm yoksa bu kısım çalışır.
         head = yeniNode;
      } else {
         Node temp = head;
         while (temp != null) {
            if (temp.next == null) { // Bu şart sağlanıyorsa; temp, son düğüm demektir.
               temp.next = yeniNode;
               break;
            }

            temp = temp.next;
         }
      }
   }

   public void listele() {
      if (head == null) {
         System.out.println("Liste boş!");
      } else {
         System.out.println("----------");
         Node temp = head;
         while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
         }
         System.out.println("----------");
      }
   }
}

class Node {
   int data;
   Node next;

   public Node(int data) {
      this.data = data;
      this.next = null;
   }
}
