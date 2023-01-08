package ders8;

// Önceki soruda, isme göre oluşturduğunuz rehberi;
// isim, soyisim ve telefon numarası olacak şekilde geliştiriniz.
public class Soru4 {
   public static void main(String[] args) {
      BagliListe4 liste = new BagliListe4();

      Kisi kisi1 = new Kisi("Zeki", "ÇIPLAK", "05529991111");
      liste.basaEkle(kisi1);

      Kisi kisi2 = new Kisi("Ahmet", "ÖZTÜRK", "05553332211");
      liste.basaEkle(kisi2);

      liste.listele();

      liste.ara("Zeki");
      liste.sil("Zeki");

      liste.listele();
   }
}

class BagliListe4 {
   Node4 head;

   public void basaEkle(Kisi kisi) {
      Node4 yeniDugum = new Node4(kisi);

      if (head == null) {
         head = yeniDugum;
      } else {
         yeniDugum.next = head;
         head = yeniDugum;
      }
   }

   public void ara(String ad) {
      Node4 temp = head;

      while (temp != null) {
         if (temp.kisi.ad.equals(ad)) {
            System.out.println("Aradığınız ad listede var: " + ad);
            return;
         }

         temp = temp.next;
      }

      System.out.println("Aradığınız ad: " + ad + " listede yok!");
   }

   public void sil(String ad) {
      Node4 onceki = null;
      Node4 temp = head;

      if (head == null) {
         System.out.println("Liste zaten boş!");
      } else if (head.kisi.ad.equals(ad)) {
         head = head.next;
      } else {
         onceki = head;
         while (temp != null) {
            if (temp.kisi.ad.equals(ad)) {
               onceki.next = temp.next;
               break;
            }

            onceki = temp;
            temp = temp.next;
         }
      }
   }

   public void listele() {
      Node4 temp = head;
      System.out.println("--İsim Listesi--");
      while (temp != null) {
         System.out.println(temp.kisi.ad + " "
                 + temp.kisi.soyad + " : "
                 + temp.kisi.tel);
         temp = temp.next;
      }
      System.out.println("----------------");
   }
}

class Kisi {
   String ad;
   String soyad;
   String tel;

   public Kisi(String ad, String soyad, String tel) {
      this.ad = ad;
      this.soyad = soyad;
      this.tel = tel;
   }
}

class Node4 {
   Kisi kisi;
   Node4 next;

   public Node4(Kisi kisi) {
      this.kisi = kisi;
      this.next = null;
   }
}
