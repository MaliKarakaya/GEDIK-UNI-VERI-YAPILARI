package ders9;

public class DiziStack1 {
   // Dizi ile Yığın Veri Yapısını Oluşturmak
   public static void main(String[] args) {
      DiziStack ds = new DiziStack(5); // boş bir stack tanımlıyoruz.

      ds.push(10);
      ds.push(20);
      ds.push(30);
      ds.push(40);
      ds.push(50);
      ds.peek();

      ds.pop();
      ds.pop();
      ds.pop();
      ds.pop();
      ds.peek();

      ds.clear();
      ds.pop();
   }
}

class DiziStack {
   int top;
   int boyut;
   Object[] dizi;

   public DiziStack(int boyut) {
      this.boyut = boyut;
      this.top = -1;
      this.dizi = new Object[boyut];
      // int[] dizi = new int[5];
   }

   // isFull: yığının dolu olup-olmadığını kontrol eden metot
   public boolean isFull() {
      return (top == boyut - 1);
   }

   // push: yığına yeni elemen ekleme metodu
   public void push(Object eklenecek) {
      if (isFull()) {
         System.out.println("Yığın kapasitesi dolu! Ekleme yapılmadı!");
         return;
      }

      top++;
      dizi[top] = eklenecek;
   }

   // isEmpty: yığının boş olup-olmadığını kontrol eden metot
   public boolean isEmpty() {
      return (top == -1);
   }

   // pop: yığından eleman çıkartma metodu
   public Object pop() {
      if (isEmpty()) {
         System.out.println("Yığın zaten boş!");
         return null;
      }

      Object silinecek = dizi[top];
      top--;

      return silinecek;
   }

   // peek: yığının tepesindeki (en son eklenen) elemanın değerini döndüren metot
   public Object peek() {
      if (isEmpty()) {
         System.out.println("Yığın zaten boş!");
         return null;
      }

      return dizi[top];
   }

   // clear: yığını boşaltma metodu
   public void clear() {
      top = -1;
      System.out.println("Yığın boşaltıldı!");
   }
}
