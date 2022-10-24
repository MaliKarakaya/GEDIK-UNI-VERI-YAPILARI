
package uygulamalar;

import java.util.Scanner;

public class ScannerSinifi2 {
    public static void main(String[] args) {
        // Bu örnekte kullanıcı; isim, yaş ve boy bilgisi girsin.
       // Girilen bilgileri konsola yazdıralım.
       
       Scanner input= new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String isim = input.nextLine();
        System.out.println("yasinizi giriniz:");
        int yas =  input.nextInt();
        System.out.println("boyunuzu giriniz:");
        double boy = input.nextDouble();
        
        System.out.println("isminiz----"+isim);
        System.out.println("yasiniz----"+yas);
        System.out.println("boyunuz----"+boy);
    }
    
}
