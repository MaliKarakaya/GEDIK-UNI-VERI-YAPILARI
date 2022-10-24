
package ders2;

import java.util.Scanner;


public class DiziSoru2 {
    public static void main(String[] args) {
        // Soru 2
      // 5 elemanlı bir diziye, kullanıcının girdiği sayıları kaydedin.
      // Ardından, dizideki tüm sayıların ortalamasını bulup konsola yazdırın.
      Scanner input =new Scanner(System.in);
      int[] sayilar =new int[5];
      for(int i=0; i<5 ;i++)
      {
          System.out.println((i+1)+" .Sayiyi giriniz:");
          sayilar[i]=input.nextInt();
          System.out.println("*********************");
      }
      int toplam=0;
      for(int a : sayilar)
      {
      toplam+=a;
      }
      double ortalama=toplam/5;
        System.out.println("Ortalaması:"+ortalama);
    }
}
