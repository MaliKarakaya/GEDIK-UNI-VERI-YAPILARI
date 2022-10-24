
package uygulamalar;

import java.util.Scanner;


public class dortislem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Birinci Sayiyi Giriniz: ");
        double sayi1 = input.nextDouble();
        
        System.out.println("İkinci Sayiyi Giriniz: ");
        
        double sayi2 = input.nextDouble();
        
        double toplam=sayi1+sayi2;
        double cikar=sayi1-sayi2;
        double carp=sayi1*sayi2;
        double bol=sayi1/sayi2;
        
        System.out.println("Toplam: "+toplam);
        System.out.println("Cikarma: "+cikar);
        System.out.println("Carpma: "+carp);
        System.out.println("Bolme: "+bol);
    }
}
