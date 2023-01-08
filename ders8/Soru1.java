package ders8;

public class Soru1 {
   // Bir bağlı listede,
   // liste sonundaki elemanı silen sondanSil() adlı bir metod oluşturun.
   // Oluşturacağınız metodun, zaman karmaşıklığı O(1) olsun.
   public static void main(String[] args) {
      BagListe liste = new BagListe();
      liste.basaEkle(10);
      liste.basaEkle(20);
      liste.basaEkle(30);
      liste.basaEkle(40);
      liste.listele();
   }
}

class BagListe {
   Node1 head;
   Node1 tail; // tail, son düğümün bilgisini tutmak için kullanılacak ama yeterli değil.
   // düğümün şeklinin de değiştirilmesi gerekir.
   // sadece next değil, bir önceki düğüme gidebilmemizi sağlayan,
   // prev gibi bir değişken de gerekir.
   // kısaca ÇİFT YÖNLÜ BAĞLI LİSTE oluşturmamız gerekecektir.

   public void basaEkle(int data) {
      Node1 yeniNode = new Node1(data);

      if (head == null) {
         head = yeniNode;
         tail = yeniNode;
      } else {
         head.prev = yeniNode;
         yeniNode.next = head;
         head = yeniNode;
      }
   }

   public void sondanSil() {
      if (tail == null) {
         System.out.println("Liste zaten boş!");
      } else {
         Node1 onceki = tail.prev;
         onceki.next = null;
      }
   }

   public void listele() {
      if (head == null) {
         System.out.println("Liste boş!");
      } else {
         System.out.println("--------");
         Node1 temp = head;
         while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
         }
      }
   }
}

class Node1 {
   int data;
   Node1 next;
   Node1 prev; // Bir bağlı listenin çift yönlü olabilmesi için,
   // düğümünü çift yönlü yapmak yeterlidir.
   // o halde her ekleme işleminde, prev değişkenini de güncellemek gerekecektir.

   public Node1(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
   }
}
