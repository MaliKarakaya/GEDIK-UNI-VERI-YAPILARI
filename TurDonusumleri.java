
package uygulamalar;

public class TurDonusumleri {
    public static void main(String[] args) {
           // Tür dönüşümleri (Type Casting)

      // double -> int
      double sayi = 512.9;
      int sayi2 = (int) sayi; // Tüm int'ler aynı zamanda double'dır.
      System.out.println(sayi);
      System.out.println(sayi2);
      System.out.println("-------");

      // String -> int
      String sayi4 = "100";
      int sayi5 = Integer.parseInt(sayi4);
      System.out.println(sayi5);
      System.out.println("-------");

      // String -> double
      String sayi6 = "315.97";
      double sayi7 = Double.parseDouble(sayi6);
      System.out.println(sayi7);

      // int -> String
      int sayi9 = 37452;
      // buraya girilen değişkenler String'e çevrilir.
      String sayi10 = String.valueOf(sayi9);
      System.out.println(sayi10);

      // int -> String
      // Üsttekinin kısa kullanımı
      int s = 5;
      String y = s + "";
      System.out.println(y);

      // double -> String
      double a = 3.4;
      String d = a + "0";
      System.out.println(d);
	  
	  // int -> char
      char karakter = 77; // aslında olan şey char karakter = (char) 77;
      System.out.println(karakter);
      System.out.println("-------");

      // char -> int
      int krktr = 'x'; // aslında olan şey, int krktr = (int) 'x';
      System.out.println(krktr);
      System.out.println("-------");
    }
}
