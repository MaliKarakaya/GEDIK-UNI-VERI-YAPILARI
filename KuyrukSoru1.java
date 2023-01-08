package ders11;

public class KuyrukSoru1 {
   public static void main(String[] args) {
// Kullanıcı aşağıdaki metni girdiğinde,
// sadece harf görülen yerler ekrana basılsın.
// sonuçta tüm yıldızlardan temizlenmiş olarak
// ve kuyruk veri yapısı kullanılarak, esas yazı ekranda gözükmüş olsun.

      String metin = "**G**e****d****i****k**";
      KuyrukChar k = new KuyrukChar();

      // Öncelikle string ifadeyi harf harf gezip,
      // ardından * olmayan harfleri kuyruk veri yapısına ekliyoruz.
      for (int i = 0; i < metin.length(); i++) {
         char temp = metin.charAt(i);

         if (temp != '*') {
            k.enqueue(temp);
         }
      }

      // Sonra da, kuyruk içerisindeki harfleri tek tek okuyup,
      // konsola yazdırıyoruz.
      while (!k.isEmpty()) {
         System.out.print(k.dequeue());
      }

      System.out.println("");
   }
}

class KuyrukChar {
   Node front, rear;

   public void enqueue(char data) {
      Node yeniNode = new Node(data);

      if (rear == null) {
         front = yeniNode;
         rear = yeniNode;
      } else {
         rear.next = yeniNode;
         rear = yeniNode;
      }
   }

   public char dequeue() {
      if (front == null) {
         return ' ';
      }

      char silinen = front.data;
      front = front.next;

      if (front == null) {
         rear = null;
      }

      return silinen;
   }

   public boolean isEmpty() {
      return front == null;
   }
}

class Node {
   char data;
   Node next;

   public Node(char data) {
      this.data = data;
      this.next = null;
   }
}
