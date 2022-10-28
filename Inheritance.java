 package ders4;

public class Inheritance {
   public static void main(String[] args) {
      Avukat avukat = new Avukat("Ali", "Aydın");
      System.out.println(avukat.ad + " " + avukat.soyad);
      avukat.konus("Merhaba herkese!");
   }
}

class Insan {
   String ad;
   String soyad;

   public Insan(String ad, String soyad) {
      this.ad = ad;
      this.soyad = soyad;
   }

   public void konus(String text) {
      System.out.println(ad + " diyor ki: " + text);
   }
}

class Avukat extends Insan {
   Avukat(String ad, String soyad) {
      super(ad, soyad);
   }
}
