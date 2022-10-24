
package uygulamalar;

public class Hesaplama {
    public static void main(String[] args) {
      // Hesaplamalarda dikkat edilmesi gerekenler
      int x = 10;
      int y = 5;

      // +, her iki yanında sayısal değer varsa, matematiksel toplar.
      // +, her iki yanında text varsa, onları birleştirir.
      System.out.println("x + y = " + x + y);
      System.out.println("x + y = " + (x + y));

      // - işleminde mutlaka parantez olmalı.
      System.out.println(x - y);
      System.out.println("x - y = " + (x - y));

	  // * işleminde mutlaka parantez olmalı.
      System.out.println("x * y = " + (x * y));

      // x ve y ikisi de int olduğu için, sonuç yine int çıkar.
      System.out.println("x / y = " + (x / y));

	  // toplam, fark ve çarpma aynı, bölmede farklılık var.
      double a = 14;
      double b = 3;
      System.out.println("a / b = " + a / b); // işlem önceliği olduğu için sorun yok!
      System.out.println("a / b = " + (a / b));

      // alternatif olarak
      double sonuc = a + b;
      System.out.println("a + b = " + sonuc);

      // mod almak için % karakteri kullanılır.
      System.out.println(a % 3);
   }
}
