package ders9;

import java.util.Scanner;

public class Soru1 {
   public static void main(String[] args) {
      // Kullanıcıdan alınan bir kelimeyi ters çeviren Java kodunu
      // Stack veri yapısını kullanarak yazınız.
      LListStack ls = new LListStack();

      Scanner input = new Scanner(System.in);
      System.out.println("Lütfen bir kelime giriniz: ");
      String kelime = input.nextLine();

      int len = kelime.length();
      for (int i = 0; i < len; i++) {
         String harf = String.valueOf(kelime.charAt(i));
         ls.push(harf);
      }

      // ters çevirme işlemine geçiyoruz!
      for (int i = 0; i < len; i++) {
         System.out.print(ls.pop());
      }

      System.out.println("");
   }
}
