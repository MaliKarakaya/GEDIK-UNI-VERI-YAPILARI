package ders8;

public class Soru2 {
// İki adet bağlı liste oluşturun.
// Birinci bağlı listenin elemanları: 1, 23, 45 olsun.
// İkinci bağlı listenin elemanları: 34, 67, 89 olsun.
// Bağlı listeye ekleme işlemini "başa ekleme" şeklinde yapın.
// Bu iki bağlı listeyi birleştirmek için, yeni bir sınıf ve metod yazın.

   public static void main(String[] args) {
      BagliListe bir = new BagliListe();
      bir.basaEkle(1);
      bir.basaEkle(23);
      bir.basaEkle(45);

      BagliListe iki = new BagliListe();
      iki.basaEkle(34);
      iki.basaEkle(67);
      iki.basaEkle(89);

      Birlestir uc = new Birlestir();
      uc.birlestir(bir, iki);
      uc.listele();
   }
}

class Birlestir {
   BagliListe birlesmis;

   public void birlestir(BagliListe bir, BagliListe iki) {
      birlesmis = new BagliListe();

      Node temp = bir.head;
      while (temp != null) {
         birlesmis.basaEkle(temp.data);
         temp = temp.next;
      }

      temp = iki.head;
      while (temp != null) {
         birlesmis.basaEkle(temp.data);
         temp = temp.next;
      }
   }

   public void listele() {
      Node temp = birlesmis.head;

      while (temp != null) {
         System.out.println(temp.data);
         temp = temp.next;
      }
   }
}

class BagliListe {
   Node head;

   public void basaEkle(int data) {
      Node yeniNode = new Node(data);

      if (head == null) {
         head = yeniNode;
      } else {
         yeniNode.next = head;
         head = yeniNode;
      }
   }

   public void listele() {
      Node temp = head;

      while (temp != null) {
         System.out.println(temp.data);
         temp = temp.next;
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
