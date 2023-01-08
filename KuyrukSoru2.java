package ders11;

public class KuyrukSoru2 {
   public static void main(String[] args) {
// Kullanıcının girdiği bir tam sayıyı, 1'den başlayarak
// binary formatta girilen sayıya kadar sayan programın kodunu
// kuyruk veri yapısını kullanarak yazınız.

// Kullanıcı 5 girmişse programın çıktısı aşağıdaki gibi olacaktır:
// 1 10 11 100 101
      int n = 10;
      KuyrukStr k = new KuyrukStr();

      k.enqueue("1");   // tüm binary sayıların başında 1 olacak.
      for (int i = 0; i < n; i++) {
         String temp = k.dequeue();
         System.out.print(temp + " ");

         // sürekli, önceki bir binary sayının, sonuna 0 ve 1 eklenerek
         // sonraki binary sayılar oluşturuluyor.
         //
         // mesela yukarıda verilen örnekte;
         // ilk sayı olan 1'in yanına 0 ve 1 eklenerek,
         // 10 ve 11 sayıları oluşturuluyor.
         //
         // daha sonra ikinci sayı olan 10 sayısının,
         // sonuna 0 ve 1 eklenerek 100 ve 101 binary sayıları oluşturuluyor.
         // bu böyle sonsuza kadar gidiyor...
         //
         // o halde, sırayla yazdırdıklarımızdan,
         // en son yazdırdığımızı kenara kaydederek, sonuna 0 ve 1 ekleyerek
         // sonraki sayıları oluşturmuş oluyoruz.
         k.enqueue(temp + "0");
         k.enqueue(temp + "1");
      }

      System.out.println("");
   }
}

class KuyrukStr {
   Node front, rear;

   public void enqueue(String data) {
      Node yeniNode = new Node(data);

      if (rear == null) {
         front = yeniNode;
         rear = yeniNode;
      } else {
         rear.next = yeniNode;
         rear = yeniNode;
      }
   }

   public String dequeue() {
      if (front == null) {
         return null;
      }

      String silinen = front.data;
      front = front.next;

      if (front == null) {
         rear = null;
      }

      return silinen;
   }
}

class Node {
   String data;
   Node next;

   public Node(String data) {
      this.data = data;
      this.next = null;
   }
}
