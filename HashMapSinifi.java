
package uygulamalar;

import java.util.HashMap;

public class HashMapSinifi {
    public static void main(String[] args) {
        // HashMap, (key : value) ikilileri oluşturmamızı sağlar.
	// Python'daki dict veri türüne benzer.
   
      HashMap<String, String> map = new HashMap<>();

      // put()  // daha önce girilmemiş kayıtı map'e ekler.
      // daha önce girilmiş bir kayıtsa, güncelleme işlemi yapar.
      map.put("ad", "veli");
      map.put("soyad", "öztürk");
      map.put("sehir", "istanbul");
      map.put("yas", "27");
      map.put("meslek", "bilgisayar programcısı");
      map.put("tel", "+905551112233");

      map.put("ad", "zeki"); // ad anahtarı, daha önce girildiği için,
      // anahtarın önceki değeri, yeni girilen değerle değiştirilir.

      for (HashMap.Entry<String, String> kayit : map.entrySet()) {
         String key = kayit.getKey();
         String val = kayit.getValue();
         System.out.println("key: " + key + ", val: " + val);
      }

      // get(key)  // girilen key'in karşılığı olan değeri döndürür.
      System.out.println("ad = " + map.get("ad"));
      System.out.println("soyad = " + map.get("soyad"));
      System.out.println("sehir = " + map.get("sehir"));

      // containsKey(key)  // girilen key'in map'te olup olmadığını sorgular.
      System.out.println("ad -> " + map.containsKey("ad"));

      // containsValue(val)  // girilen val'in map'te olup olmadığını sorgular.
      System.out.println("istanbul -> " + map.containsValue("istanbul"));

      // clear()  // map'teki tüm kayıtları siler.
      map.clear();

      // isEmpty()  // map'in boş olup olmadığını sorgular.
      System.out.println("map boş mu? : " + map.isEmpty());
    }
}
