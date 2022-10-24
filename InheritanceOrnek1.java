
package uygulamalar;

public class InheritanceOrnek1 {
    public static void main(String[] args) {
        
      Daire daire = new Daire("mavi");
      System.out.println("Dairenin rengi: " + daire.renk);

      daire.renkDegistir("kırmızı");
      System.out.println("Dairenin yeni rengi: " + daire.renk);

      daire.alanHesapla(10);
    }
}
class Sekil {
   String renk;

   public Sekil(String renk) {
      this.renk = renk;
   }

   public void renkDegistir(String yeniRenk) {
      renk = yeniRenk;
   }
}

class Daire extends Sekil {
   public Daire(String renk) {
      super(renk);
   }

   // sonradan eklendi
   // daha önce başkası tarafından yazılan sınıfı geliştirmiş oluyoruz.
   public void alanHesapla(double r) {
      System.out.println("Dairenin alanı: " + (3.14 * r * r));
   }
}