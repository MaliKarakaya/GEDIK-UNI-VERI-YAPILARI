
package uygulamalar;


public class Constructor {
    public static void main(String[] args) {
         Insan x = new Insan();
      x.ad = "Mehmet";
      x.soyad = "Öztürk";
      x.yas = 23;
      x.boy = 1.74;

      System.out.println("Adı: " + x.ad);
      System.out.println("Soyadı: " + x.soyad);
      System.out.println("Yaşı: " + x.yas);
      System.out.println("Boyu: " + x.boy);

      x.kos();

      // Şimdi parametreli constructor'ı kullanarak, nesne oluşturalım.
      Insan y = new Insan("Ayşe", "Öztürk", 20, 1.67);

      System.out.println("Adı: " + y.ad);
      System.out.println("Soyadı: " + y.soyad);
      System.out.println("Yaşı: " + y.yas);
      System.out.println("Boyu: " + y.boy);
    }
}
class Insan {
   String ad;
   String soyad;
   int yas;
   double boy;

   // Constructor'lar, yapıcı metod olarak bilinir.
   // Nesne oluşurken, nesneye ait özelliklerin girilebilmesi ve
   // Nesne oluşurken, yapılması gereken işlemlerin yapılabilmesini sağlar.
   public Insan(String ad, String soyad, int yas, double boy) { // Parametreli Constructor
      // this kelimesi kullanılmazsa, karışıklık olur.
      // this.ad sınıf içerisindeki ad değişkenidir.
      // diğeri ise, parametrede girilen ad değeridir.
      this.ad = ad;

      this.soyad = soyad;
      this.yas = yas;
      this.boy = boy;
   }

   // Bu da bir Constructor'dır.
   // Hiç constructor oluşturmasak bile,
   // Java JDK otomatik olarak böyle bir constructor'ı oluşturur.
   // Fakat yukarıda parametreli bir constructor oluşturduğumuz için,
   // Şimdi bunu kullanmazsak, yukarıda nesne oluştururken,
   // mutlaka sınıf içi malum değişkenlerin değerlerini girmek zorunda kalırız.
   public Insan() { // Parametresiz Constructor

   }

   public void kos() {
      System.out.println(ad + " koşuyor.");
   }
}

