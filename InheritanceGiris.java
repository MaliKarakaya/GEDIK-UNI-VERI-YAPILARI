
package uygulamalar;


public class InheritanceGiris {
    // Kalıtım ile bir sınıfın tüm özellikleri, başka bir sınıfa aktarılabilir.
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
   // Insan sınıfı, Avukat sınıfının üst sınıfı olur. (Super Class)

   Avukat(String ad, String soyad) {
      super(ad, soyad);
   }
}