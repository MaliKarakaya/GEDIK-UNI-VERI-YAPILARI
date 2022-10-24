package uygulamalar;

import java.util.ArrayList;


public class ClassOrnek4 {
    public static void main(String[] args) {
         // Soru
      // Notlar adlı bir sınıf oluşturunuz.
      // Kullanıcılar not ekleyebilsin, not silebilsin,
      // daha önce girdikleri notu güncelleyebilsin ve
      // kayıtlı tüm notları listeleyebilsinler.
      // Ayrıca yapılan her işlem için konsola bilgi verilsin.
      Notlar nesne = new Notlar();

      nesne.NotEkle("Kutu temizlemeden elbise alınacak");
      nesne.NotEkle("Sunum hazırlanacak");
      nesne.NotEkle("Doktora gidilecek");
      nesne.NotListele();

      nesne.NotGuncelle(0, "Kuru temizlemeden elbise alınacak");
      nesne.NotListele();

      nesne.NotSil(0);
      nesne.NotListele();
    }
}
class Notlar{
ArrayList<String> notlar;

public Notlar(){
notlar = new ArrayList<>();
}
public void NotEkle(String not){
 notlar.add(not);
    System.out.println("Yeni Not Eklendi: "+not);
}

public void NotSil(int id){
   String silinecek = notlar.get(id);
   notlar.remove(silinecek);
    System.out.println("Not Silindi: "+silinecek);
}
public void NotGuncelle(int id , String not){
String GuncellenecekNot = notlar.get(id);
notlar.remove(GuncellenecekNot);
notlar.add(id,not);
System.out.println("id'si " + id + " olan not güncellendi: " + not);
}
public void NotListele(){
    System.out.println("**********************");
    for(int i = 0; i < notlar.size(); i++){
     System.out.println("id: " + i + ", not: " + notlar.get(i));
    }
    System.out.println("------");
}

}
