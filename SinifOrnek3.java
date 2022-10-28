package ders4;

import java.util.Scanner;

public class SinifOrnek3 {
   public static void main(String[] args) {
      // Soru
      // Kullanıcıdan iki sayı alan ve dört işlem
      // (toplama, çıkartma, çarpma, bölme) yapan bir sınıf yazınız.

      Scanner input = new Scanner(System.in);
      System.out.println("1. sayı: ");
      double sayi1 = input.nextDouble();
      System.out.println("2. sayı: ");
      double sayi2 = input.nextDouble();

      DortIslem islemler = new DortIslem(sayi1, sayi2);
      System.out.println("Toplama: " + islemler.toplama(sayi1, sayi2));
      System.out.println("Çıkartma: " + islemler.cikartma(sayi1, sayi2));
      System.out.println("Çarpma: " + islemler.carpma(sayi1, sayi2));
      System.out.println("Bölme: " + islemler.bolme(sayi1, sayi2));
   }
}

class DortIslem {
   double sayi1;
   double sayi2;

   public DortIslem(double sayi1, double sayi2) {
      this.sayi1 = sayi1;
      this.sayi2 = sayi2;
   }

   public double toplama(double sayi1, double sayi2) {
      return sayi1 + sayi2;
   }

   public double cikartma(double sayi1, double sayi2) {
      return sayi1 - sayi2;
   }

   public double carpma(double sayi1, double sayi2) {
      return sayi1 * sayi2;
   }

   public double bolme(double sayi1, double sayi2) {
      return sayi1 / sayi2;
   }
}
