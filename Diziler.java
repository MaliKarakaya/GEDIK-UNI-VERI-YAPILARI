
package uygulamalar;

public class Diziler {
    public static void main(String[] args) {
       // int tipinde dizi üretilip indexlere değer ataması yapılmazsa
      // varsayılan değeri 0 olarak kabul edilir.
      int[] sayilar = new int[10]; // dizi oluşturma satırı
      sayilar[0] = 10;
      sayilar[1] = 20;
      sayilar[2] = 30;
      sayilar[3] = 40;
      sayilar[4] = 50;
      // ilk 3 elemanını yazdıralım
      System.out.println(sayilar[0]);
      System.out.println(sayilar[3]);
      System.out.println(sayilar[9]);
      
      // Bu şekilde de dizi oluşturulabilir.
      int[] dizi = {1, 2, 3, 4, 5};
      
       // ilk ikiyi yazdıralım
      System.out.println(dizi[0]);
      System.out.println(dizi[4]);
      
      // String dizisinde indexlere değer ataması yapılmazsa
      // varsayılan değeri null'dır.
      String[] strDizisi = new String[10];
      strDizisi[0] = "İstanbul";
      strDizisi[1] = "Gedik";
      strDizisi[2] = "Üniversitesi";
      strDizisi[3] = "Bilgisayar";
      strDizisi[4] = "Programcılığı";

      System.out.println(strDizisi[0]);
      System.out.println(strDizisi[1]);
      System.out.println(strDizisi[5]);
      System.out.println(strDizisi[6]);
      System.out.println(strDizisi[7]);
      System.out.println(strDizisi[8]);
      
       // Öğrenci süslü parantezle String dizisi oluştursun.
      String[] sehirler = {"İstanbul", "Ankara", "İzmir"};

      System.out.println(sehirler[0]);
      System.out.println(sehirler[1]);
      System.out.println(sehirler[2]);

    }
}
