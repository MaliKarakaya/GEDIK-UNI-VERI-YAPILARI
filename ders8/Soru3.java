package ders8;

// Bağlı liste kullanarak bir isim rehberi oluşturun.
// Rehbere isim eklenebilsin ve çıkarılabilsin.
// Rehberde isme göre arama yapılabilsin.
public class Soru3 {
   public static void main(String[] args) {
      BListe liste = new BListe();
      liste.ara("Ali");

      liste.basaEkle("Ayşe");
      liste.basaEkle("Yasemin");
      liste.basaEkle("Hakan");
      liste.basaEkle("Tamer");
      liste.listele();
      liste.ara("Ayşe");
   }
}

class BListe {
   Dugum head;

   public void basaEkle(String data) {
      Dugum yeniDugum = new Dugum(data);

      if (head == null) {
         head = yeniDugum;
      } else {
         yeniDugum.next = head;
         head = yeniDugum;
      }
   }

   public void sil(String ad) {
      Dugum onceki = null;
      Dugum temp = head;

      if (head == null) {
         System.out.println("Liste zaten boş!");
      } else if (head.data.equals(ad)) {
         head = head.next;
      } else {
         onceki = head;
         while (temp != null) {
            if (temp.data.equals(ad)) {
               onceki.next = temp.next;
               break;
            }

            onceki = temp;
            temp = temp.next;
         }
      }
   }

   public void ara(String ad) {
      Dugum temp = head;

      while (temp != null) {
         if (temp.data.equals(ad)) {
            System.out.println("Aradığınız ad listede var: " + ad);
            return;
         }

         temp = temp.next;
      }

      System.out.println("Aradığınız ad: " + ad + " listede yok!");
   }

   public void listele() {
      Dugum temp = head;
      System.out.println("--İsim Listesi--");
      while (temp != null) {
         System.out.println(temp.data);
         temp = temp.next;
      }
      System.out.println("----------------");
   }
}

class Dugum {
   String data;
   Dugum next;

   public Dugum(String data) {
      this.data = data;
      this.next = null;
   }
}
