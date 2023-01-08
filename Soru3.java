package ders9;

public class Soru3 {
   public static void main(String[] args) {
      // Bir tam sayı dizisindeki sayıların toplamının iki katını bulan java kodunu
      // Stack veri yapısını kullanarak yazınız.
      MyStack ms = new MyStack();

      int toplam = 0;
      int[] dizi = {3, 4, 5, 6, 7};

      for (int i = 0; i < dizi.length; i++) {
         ms.push(dizi[i]);
         toplam += dizi[i];
      }

      for (int i = 0; i < dizi.length; i++) {
         toplam += ms.pop();
      }

      System.out.println("Toplam: " + toplam);
   }
}
