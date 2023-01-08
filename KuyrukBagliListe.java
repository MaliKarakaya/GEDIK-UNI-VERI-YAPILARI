package ders10;

public class KuyrukBagliListe {
   public static void main(String[] args) {
      BagliListe ky = new BagliListe();

      ky.enqueue(10);
      ky.enqueue(20);
      ky.enqueue(30);
      ky.enqueue(40);
      ky.enqueue(50);

      ky.dequeue(); // kuyruğun başındaki eleman çıkartılıyor.
      ky.dequeue(); // kuyruğun başındaki eleman çıkartılıyor.

      ky.front();
      ky.rear();
   }
}

class BagliListe {
   Node front, rear;

   // Kuyruğa eleman ekleme metodu
   public void enqueue(int data) {
      Node yeniNode = new Node(data);

      if (rear == null) {
         rear = yeniNode;
         front = yeniNode;
      } else {
         rear.next = yeniNode;
         rear = yeniNode;
      }
   }

   // Kuyruktan eleman silme metodu
   public int dequeue() {
      if (isEmpty()) {
         System.out.println("Kuyruk boş!");
         return -1;
      }

      int silinen = front.data;
      front = front.next;

      if (front == null) {
         // eğer geriye 1 eleman kaldıysa,
         // o aynı zamanda ilk ve son elemandır!
         rear = null;
      }

      return silinen;
   }

   // Kuyruğun boş olup-olmadığını kontrol eden metot
   public boolean isEmpty() {
      return front == null;
   }

   // Kuyruğun başındaki elemanı gösteren metot
   public void front() {
      System.out.println("Kuyruğun başındaki eleman: " + front.data);
   }

   // Kuyruğun sonundaki elemanı gösteren metot
   public void rear() {
      System.out.println("Kuyruğun sonundaki eleman: " + rear.data);
   }
}

// Düğüm sınıfı
class Node {
   int data;
   Node next;

   public Node(int data) {
      this.data = data;
      this.next = null;
   }
}
