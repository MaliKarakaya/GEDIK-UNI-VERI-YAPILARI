
package uygulamalar;

import java.util.Scanner;



public class ScanerSinifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Isminizi Giriniz: ");
        String isim = input.nextLine();
        System.out.println("Girdiginiz isim: "+isim);
    }
}
