package uygulamalar;

import java.util.Scanner;


public class ClassOrnek1 {
    public static void main(String[] args) {
          // Kullanıcının girdiği yarıçapa göre
   // çemberin alanını ve çevresini hesaplayan,
   // Cember isimli bir sınıf oluşturun.

   // Çember Alanı = pi * r * r
   // Çember Çevresi = 2 * pi * r
   
   Scanner input = new Scanner(System.in);
        System.out.println("Yari capi giriniz: ");
        double yaricap = input.nextDouble();
        
        Cember nesne = new Cember(yaricap);
        System.out.println("Cemberin Cevresi: "+nesne.cevreHesapla());
        System.out.println("Cemberin Alanı: "+nesne.alanHesapla());
        
   
   
    }
}
class Cember{
  double pi=3.14;
  double r;
  
  public Cember(double r){
  this.r=r;
  }
  public double alanHesapla(){
  return pi*r*r;
  }
  public double cevreHesapla(){
  return 2*pi*r;
  }
}