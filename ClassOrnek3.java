
package uygulamalar;

import java.util.Scanner;


public class ClassOrnek3 {
    public static void main(String[] args) {
         // Soru
      // Kullanıcıdan iki sayı alan ve dört işlem
      // (toplama, çıkartma, çarpma, bölme) yapan bir sınıf yazınız.
      Scanner input= new Scanner(System.in);
        System.out.println("1.sayiyi giriniz: ");
        double sayi1=input.nextDouble();
        System.out.println("2. sayiyi giriniz");
        double sayi2=input.nextDouble();
        
        DortIslem nesne = new DortIslem(sayi1, sayi2);
        
         System.out.println("Toplam Sonucu:"+nesne.toplam(sayi1, sayi2));
         System.out.println("Cikarma İslemi:"+nesne.cikartma(sayi1, sayi2));
         System.out.println("Carpma İslemi:"+nesne.carpma(sayi1, sayi2));
         System.out.println("Bolme İslemi: "+nesne.bolme(sayi1, sayi2));
      
    }
}
class DortIslem{
 double sayi1;
 double sayi2;
 public DortIslem(double sayi1 , double sayi2){
 this.sayi1 = sayi1;
 this.sayi2 = sayi2;
 }
 public double toplam(double sayi1, double sayi2){
  return sayi1+sayi2;
 }       
 public double cikartma(double sayi1, double sayi2){
 return sayi1-sayi2;
 }
 public double carpma(double sayi1,double sayi2){
 return sayi1*sayi2;
 }
 public double bolme(double sayi1 , double sayi2){
 return sayi1/sayi2;
 }
}