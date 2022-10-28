package ders4;

import java.util.ArrayList;

public class SinifOrnek4 {
   public static void main(String[] args) {
      // Soru
      // Notlar adlı bir sınıf oluşturunuz.
      // Kullanıcılar not ekleyebilsin, not silebilsin,
      // daha önce girdikleri notu güncelleyebilsin ve
      // kayıtlı tüm notları listeleyebilsinler.
      // Ayrıca yapılan her işlem için konsola bilgi verilsin.
      Notlar nesne = new Notlar();

      nesne.notEkle("Kutu temizlemeden elbise alınacak");
      nesne.notEkle("Sunum hazırlanacak");
      nesne.notEkle("Doktora gidilecek");
      nesne.notListele();

      nesne.notGuncelle(0, "Kuru temizlemeden elbise alınacak");
      nesne.notListele();

      nesne.notSil(0);
      nesne.notListele();
   }
}

class Notlar {
   ArrayList<String> notlar;

   public Notlar() {
      notlar = new ArrayList<>();
   }

   public void notEkle(String not) {
      notlar.add(not);
      System.out.println("Yeni not eklendi: " + not);
   }

   public void notSil(int id) {
      String silinecekNot = notlar.get(id); 
      notlar.remove(silinecekNot);      
      System.out.println("Not silindi: " + silinecekNot);
   }

   public void notGuncelle(int id, String not) {
      String guncellenenNot = notlar.get(id); 
      notlar.remove(guncellenenNot);          
      notlar.add(id, not);          
      System.out.println("id'si " + id + " olan not güncellendi: " + not);
   }

   public void notListele() {
      System.out.println("------");
      for (int i = 0; i < notlar.size(); i++) {
         System.out.println("id: " + i + ", not: " + notlar.get(i));
      }
      System.out.println("------");
   }
}
