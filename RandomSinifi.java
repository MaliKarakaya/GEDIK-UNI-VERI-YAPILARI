
package uygulamalar;

import java.util.Random;

public class RandomSinifi {
    public static void main(String[] args) {
        // Random Kütüphanesi
      Random rnd = new Random();

      // 0 ile 50 arası (50 dahil değil)
      // rastgele tam sayı değer üretir.
      int rastgeleSayi = rnd.nextInt(50);
      System.out.println(rastgeleSayi);

      // Integer skalasında - ve + değer üretir.
      System.out.println(rnd.nextInt());
    }
}
