package ders10;

public class KuyrukDizi {
   public static void main(String[] args) {
      Kuyruk ky = new Kuyruk(5);

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

class Kuyruk {
   int[] dizi;
   int front, rear, items, size;

   public Kuyruk(int size) {
      this.size = size;
      this.dizi = new int[size];
      this.front = 0;
      this.rear = -1;
      this.items = 0;
   }

   public boolean isFull() {
      return items == size;
   }

   public boolean isEmpty() {
      return items == 0;
   }

   public void enqueue(int data) {
      if (isFull()) {
         System.out.println("Kuyruk tamamen dolu!");
         return;
      }

      // front sabit!
      rear++;
      dizi[rear] = data;
      items++;
   }

   public int dequeue() {
      if (isEmpty()) {
         System.out.println("Kuyruk tamamen dolu!");
         return -1;
      }

      // front sabit olduğu için, dizide kaydırma işlemi yapılıyor.
      int silinen = dizi[front];
      for (int i = 1; i < rear + 1; i++) {
         int tmp = dizi[i];
         dizi[i - 1] = tmp;
      }

      items--;
      rear--;

      return silinen;
   }

   public void front() {
      System.out.println("Kuyruğun başındaki eleman: " + dizi[front]);
   }

   public void rear() {
      System.out.println("Kuyruğun sonundaki eleman: " + dizi[rear]);
   }
}
