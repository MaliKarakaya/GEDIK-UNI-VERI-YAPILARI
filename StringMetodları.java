
package uygulamalar;


public class StringMetodları {
    public static void main(String[] args) {
        String deneme = "Merhaba";

      System.out.println(deneme.charAt(5));
      System.out.println(deneme.contains("Mer"));
      System.out.println(deneme.endsWith("haba"));
      System.out.println(deneme.startsWith("Mer"));
      System.out.println(deneme.equals("Merhaba"));
      System.out.println(deneme.equalsIgnoreCase("MERHABA"));
      System.out.println(deneme.indexOf("rh"));	// ilk bulunan rh'nin yerini verir.
      System.out.println(deneme.lastIndexOf("ab"));
      System.out.println(deneme.isEmpty());
      System.out.println(deneme.length());
      System.out.println(deneme.replace("Merh", "Ar"));
      System.out.println(deneme.split("a")[0]);
      System.out.println(deneme.substring(0, 3)); 
      System.out.println(deneme.toUpperCase());
      System.out.println(deneme.toLowerCase());
      System.out.println(" deneme     ".trim());
    }
    
}
