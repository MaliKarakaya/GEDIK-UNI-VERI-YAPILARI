
package uygulamalar;

public class Donguler {
    public static void main(String[] args) {
              // FOR Döngüsü
      for (int i = 1; i < 11; i++) {
         System.out.print(i + " ");
        
      }
      System.out.println("");

      int[] sayiDizisi = new int[10];
      sayiDizisi[0] = 10;
      sayiDizisi[1] = 20;
      sayiDizisi[2] = 30;
      sayiDizisi[3] = 40;
      sayiDizisi[4] = 50;

      for (int i : sayiDizisi) {
         System.out.println(i);
      }

      // WHILE Döngüsü
      int i = 1;
      while (i < 11) {
         System.out.print(i + " ");
         i++;
      }
      System.out.println("");
    }
}
