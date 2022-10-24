
package ders2;

import java.util.Scanner;

public class DiziSoru1 {
    public static void main(String[] args) {
              // Soru 1
      // Kullanıcıdan 5 tane sayı alın ve bu 5 sayıyı bir diziye kaydedin.
      // Ardından kullanıcının girdiği 5 sayıyı liste şeklinde konsola yazdırın.
          Scanner input= new Scanner(System.in);
          int[] sayilar =new int[5];
          
          for(int i=0; i<5 ;i++)
          {
              System.out.println((i+1)+" .Sayi Giriniz: ");
              sayilar[i]=input.nextInt();
              System.out.println("****************");
          }
          for(int i : sayilar)
          {
              System.out.println(i);
          }
     
    }
}
