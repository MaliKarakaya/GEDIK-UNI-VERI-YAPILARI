
package uygulamalar;

import java.util.ArrayList;

public class InheritanceOrnek2 {
    public static void main(String[] args) {
         // Bir okuldaki duruma ait bilgiler şöyledir:
      //----------
      // Öğrenci ve Personel, adı ve soyadı olan kişilerdir.
      // Öğretmen ve Müdür, maaşları olan personellerdir.
      // Müdür aynı zamanda bir öğretmendir.
      // Öğrencilerin okul numaraları vardır.
      // Öğretmenlerin verdikleri derslerin listesi vardır.
      //----------
      // Bu özellikleri sağlayan sınıflar yapısını "kalıtımla" oluşturunuz.
    }
}
class Kisi {
   String ad;
   String soyad;
}

class Ogrenci extends Kisi {
   String okulNo;
}

class Personel extends Kisi {
   int maas;
}

class Ogretmen extends Personel {
   ArrayList<Ders> dersler;
}

class Mudur extends Ogretmen {

}

class Ders {
   String dersAdi;
}