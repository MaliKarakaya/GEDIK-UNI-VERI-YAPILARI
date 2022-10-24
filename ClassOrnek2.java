package uygulamalar;

import java.util.Scanner;

public class ClassOrnek2 {
    public static void main(String[] args) {
        // Text isimli bir sınıf oluşturun.
   // Kullanıcının girdiği bir cümleyi, kelimelerine ayırıp,
   // liste halinde konsola yazdırsın.
       
   Scanner input =new Scanner(System.in);
        System.out.println("Bir cumle giriniz: ");
        String girilen=input.nextLine();
        
        Text nesne = new Text(girilen);
        nesne.parcala();
        nesne.listele();
   
    }
            
}
class Text{
  String girilen;
  String[] parcalar;
  public Text(String girilen){
   this.girilen=girilen;
  }
  public void parcala(){
  parcalar=girilen.split(" ");
      System.out.println("Girilen cumle parcalandi");
  }
  
  public void listele(){
      System.out.println("*********");
      for(String parca : parcalar){
          System.out.println(parca);
      }
  }
}