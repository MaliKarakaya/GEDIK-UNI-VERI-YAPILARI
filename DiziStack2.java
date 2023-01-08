package ders9;

import java.util.Scanner;

public class DiziStack2 {
   // Stack veri yapısını kullanarak, bir palindrome örneği gerçekleştiriniz.
   // Palindrome'lar, düz veya ters okunduklarında aynı olan ifadelerdir.
   //------------------------------
   // adamla çene çalma da
   // ayşen ıslak kalsın eşya
   // kesti geveze tez eve gitsek
   //------------------------------
   // String içindeki tek tek karakterlere erişmek için
   // .charAt() metodunu kullanabilirsiniz.
   public static void main(String[] args) {
      DiziStack stack = new DiziStack(999);

      System.out.println("Bir cümle giriniz: ");
      Scanner input = new Scanner(System.in);
      String girilen = input.nextLine();

      girilen = girilen.replace(" ", "");
      int len = girilen.length();

      int i, orta = len / 2;
      for (i = 0; i < orta; i++) {
         // sırayla, cümlenin ortasına kadar
         // tüm harfleri yığına ekliyoruz.
         stack.push(girilen.charAt(i));
      }

      // Eğer toplam harf sayısı tekse,
      // ortadaki harfi atlamak için i değerini bir arttırıyoruz.
      if (len % 2 != 0) {
         i++;
      }

      while (i < len) {
         char stk = (char) stack.pop();
         char hrf = girilen.charAt(i);

         if (stk != hrf) {
            System.out.println("Palindrome DEĞİL!");
            return;
         }

         i++;
      }

      System.out.println("Palindrome!");
   }
}
