
package uygulamalar;

public class VeriTurleri {
    public static void main(String[] args) {
        // Tek yorum satırı
      /*
         Çoklu yorum satırı
       */

      // Konsola yazdırma işlemleri
      // Kod sonuna mutlaka noktalı virgül !
      System.out.println('a');   // Konsola satır satır yazma işlemi yapar.
      System.out.print("---");   // Alt satıra geçmez!
      System.out.println("Merhaba Arkadaşlar");

      // Veri Türleri (Primitive - İlkel)
      // Camel yazı şekline dikkat!
      int tamSayi = 5; // tam sayı değerleri alır.

      double ondalik = 1.5;
      float ondalik2 = 0.98f; // sondaki f önemli (float veri türü, yer israf etmemek için kullanılabilir)

      char c = 'A';  // char c = 65; şeklinde yazmak da aynıdır.

      boolean b = true;

      long l = 88887876; // integer'dan daha uzun

      byte by1 = -128; // -128 ile +127 arası tam sayı değerlerini alır.
      byte by2 = 127;

      short s1 = -4000; // -32768 ile 32767 arası değer alır.
      short s2 = 852;

      // Primitive olmayan veri türü
      // Her sınıf, aynı zamanda bir veri türüdür!
      String text = "Deneme 1 2 3";

      // Tüm değişkenlerin yazdırılması
      System.out.println(tamSayi);
      System.out.println(ondalik);
      System.out.println(ondalik2);
      System.out.println(c);
      System.out.println(b);
      System.out.println(l);
      System.out.println(by1);
      System.out.println(by2);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(text);
    }
}
