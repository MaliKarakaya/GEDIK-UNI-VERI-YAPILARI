
package ders2;


public class DiziSorusu3 {
    public static void main(String[] args) {
        // Soru 3
      // 11,22,33,44,55 sayılarını içeren bir dizi oluşturun.
      // Döngü ile elemanları gezerek, 33 sayısının indisini konsola yazdırın.
      int[] sayilar={10,20,30,33,40};
      for(int i=0;i<5;i++)
      {
        if(sayilar[i]==33)
              System.out.println("33 sayısının indisi: "+i);
      }
    }
}
