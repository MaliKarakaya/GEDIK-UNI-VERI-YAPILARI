
package uygulamalar;

public class MathSinifi {
    public static void main(String[] args) {
        // Mutlak Değer almak
      System.out.println(Math.abs(-3));

      // Üs almak
      System.out.println(Math.pow(3, 2));

      // Kök almak
      System.out.println(Math.sqrt(9));

      // Yuvarlama metodları
      System.out.println(Math.ceil(3.4)); // double
      System.out.println(Math.floor(3.4)); // double
      System.out.println(Math.round(3.4));

      // Max Min
      System.out.println(Math.max(3, 333));
      System.out.println(Math.min(3, 333));

      // Random
      // Math.random(), 0 ile 1 arasında değer üretir.
      System.out.println(Math.random());
      // 0-9 arası rastgele tam sayı seçer.
      System.out.println((int) (Math.random() * 10));
    }
}
