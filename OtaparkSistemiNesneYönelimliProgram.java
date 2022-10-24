package uygulamalar;

import java.util.ArrayList;

public class OtaparkSistemiNesneYönelimliProgram {
    public static void main(String[] args) {
        // Bir otopark'ta kullanılacak, nesne yönelimli bir program yazınız.
      // Otopark'a üye olan kişilerin, arabalarını park ettikleri zaman listesi tutulsun.
      // Otoparka üye olma, otoparka giren arabalar için giriş ve çıkış metodları bulunsun.
      // Anlık olarak otopark içerisindeki arabaların ve araba sahiplerinin listesi alınabilsin.
      // Dizi yerine ArrayList kullanılmalıdır.
      
      Otopark park = new Otopark();
      Uye uye1 = new Uye("Ali","Karakaya");
      Araba a1 = new Araba("Golf",uye1);
      
      Uye uye2 = new Uye("Seda","Aydın");
      Araba a2 = new Araba("BMW",uye2);
      
      park.otoparkUyelik(uye1);
      park.otoparkUyelik(uye2);
      
      park.otoparkGiris(a1);
      park.otoparkGiris(a2);
      
      park.otoparkListe();
       
      park.otoparkCikis(a2);

      park.otoparkListe();

    }
}
class Otopark {
   ArrayList<Araba> arabalar = new ArrayList<>();
   ArrayList<Uye> uyeler = new ArrayList<>();

   public void otoparkGiris(Araba araba) {
      arabalar.add(araba);
      System.out.println("Sahibi " + araba.sahip.ad + " olan " + araba.model + " araba otoparka GİRİŞ yaptı.");
   }

   public void otoparkCikis(Araba araba) {
      arabalar.remove(araba);
      System.out.println("Sahibi " + araba.sahip.ad + " olan " + araba.model + " araba otoparktan ÇIKIŞ yaptı.");
   }

   public void otoparkUyelik(Uye uye) {
      uyeler.add(uye);
      System.out.println("Ad Soyadı " + uye.ad + " " + uye.soyad + " olan YENİ bir üye KAYDEDİLDİ.");
   }

   public void otoparkListe() {
      System.out.println("::: Şuan otoparkta bulunan arabalar ve sahipleri :::");
      for (Araba araba : arabalar) {
         System.out.println("Araba: " + araba.model + ", Sahibi: " + araba.sahip.ad + " " + araba.sahip.soyad);
      }
   }
}

class Araba {
   String model;
   Uye sahip;

   public Araba(String model, Uye sahip) {
      this.model = model;
      this.sahip = sahip;
   }
}

class Uye {
   String ad;
   String soyad;

   public Uye(String ad, String soyad) {
      this.ad = ad;
      this.soyad = soyad;
   }
}
