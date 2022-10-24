
package uygulamalar;

import java.util.Scanner;


public class SayiTahmin {
    public static void main(String[] args) {
        int sayi = 5;
        Scanner input=new Scanner(System.in);
        System.out.println("1 ile 10 arasi bir sayi giriniz: ");
        int tahmin=input.nextInt();
        if(sayi==tahmin)
        {
            System.out.println("Dogru Tahmin");
        }
        else
        {
            System.out.println("Yanlis Tahmin"); 
        }
        
    }
    
}
