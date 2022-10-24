
package uygulamalar;

import java.util.ArrayList;


public class ArrayListSinifi {
    public static void main(String[] args) {
        ArrayList liste =new ArrayList<>();
        
      liste.add(100);
      liste.add(3.14);
      liste.add('c');
      liste.add("String");
      
      for(Object object : liste)
      {
          System.out.println(object);
      }
        
        
    }
}
