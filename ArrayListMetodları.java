
package uygulamalar;

import java.util.ArrayList;


public class ArrayListMetodları {
    public static void main(String[] args) {
        ArrayList liste =new ArrayList<>();
        //add(object) // eleman ekler
        liste.add(100);
        liste.add("ikiyüz");
        liste.add(3.14);
        liste.add(true);
        liste.add('c');
        //add(index, object) elamanı belli bir indise ekler
        liste.add(0,111);
        // add(index, object) // elemanı belli bir indise ekler.
      liste.add(0, 111);

      // contains(object)  // parametrede girilen'in, listede olup olmadığını sorgular.
      // true veya false döndürür.
      System.out.println(".contains() : " + liste.contains("ikiyüz"));

      // get(index)  // belli bir indis elemanını döndürür.
      System.out.println(".get() : " + liste.get(1));

      // indexOf(object)  // parametrede girilen'in,
      // listede ilk olarak kaçıncı indiste olduğunu sorgular.
      System.out.println(".indexOf() : " + liste.indexOf(3.14));

      // lastIndexOf(object)  // parametrede girilen'in,
      // listede ilk olarak kaçıncı indiste olduğunu sorgular.
      System.out.println(".lastIndexOf() : " + liste.lastIndexOf(3.14));

      // remove(object)  // parametrede belirtilen nesneyi listeden çıkartır.
      System.out.println(".remove() : " + liste.remove("ikiyüz"));

      // size()  // listenin toplam eleman sayısını döndürür.
      System.out.println(".size() : " + liste.size());

      // clear() // tüm elemanları listeden siler.
      liste.clear();

      // isEmpty() // listenin boş olup olmadığını sorgular.
      System.out.println(".isEmpty() : " + liste.isEmpty());

      // listedeki elemanları listeleme kodu
      for (Object object : liste) {
         System.out.println(object);
      }
    }
}
