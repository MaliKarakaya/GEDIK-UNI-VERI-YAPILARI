
package uygulamalar;

import java.util.ArrayList;

public class ArrayListSinifi2 {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        
        liste.add("İstanbul");
        liste.add("Ankara");
        liste.add("İzmir");
        liste.add("Bursa");
        liste.add("Adana");
        
        for(String sehir : liste)
        {
            System.out.println(liste);
        }
      
      
    }
}
